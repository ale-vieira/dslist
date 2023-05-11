package com.alevieira.dslist.services;


import com.alevieira.dslist.dtos.GameListDto;
import com.alevieira.dslist.models.GameListModel;
import com.alevieira.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameListModel> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }

}
