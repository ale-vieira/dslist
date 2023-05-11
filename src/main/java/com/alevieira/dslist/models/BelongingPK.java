package com.alevieira.dslist.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private GameModel game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameListModel list;

    public BelongingPK(){

    }

    public BelongingPK(GameModel game, GameListModel list) {
        this.game = game;
        this.list = list;
    }

    public GameModel getGame() {
        return game;
    }

    public void setGame(GameModel game) {
        this.game = game;
    }

    public GameListModel getList() {
        return list;
    }

    public void setList(GameListModel list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return game.equals(that.game) && list.equals(that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
