package com.alevieira.dslist.controllers;

import com.alevieira.dslist.dtos.GameDto;
import com.alevieira.dslist.dtos.GameListDto;
import com.alevieira.dslist.dtos.GameMinDto;
import com.alevieira.dslist.services.GameListService;
import com.alevieira.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll();
        return  result;
    }

}
