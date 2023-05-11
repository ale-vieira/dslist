package com.alevieira.dslist.services;


import com.alevieira.dslist.dtos.GameDto;
import com.alevieira.dslist.dtos.GameMinDto;
import com.alevieira.dslist.models.GameModel;
import com.alevieira.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public List<GameMinDto> findAll(){
        List<GameModel> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(GameMinDto::new).toList();
        return dto;
    }

    @Transactional
    public GameDto findById(Long id){
        GameModel result = gameRepository.findById(id).get();
        return new GameDto(result);
    }
}
