package com.alevieira.dslist.dtos;

import com.alevieira.dslist.models.GameListModel;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto(){

    }

    public GameListDto(GameListModel entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
