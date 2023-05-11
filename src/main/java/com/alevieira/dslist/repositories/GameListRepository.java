package com.alevieira.dslist.repositories;

import com.alevieira.dslist.models.GameListModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameListModel, Long> {
}
