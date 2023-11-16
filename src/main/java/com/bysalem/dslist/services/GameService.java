package com.bysalem.dslist.services;

import com.bysalem.dslist.DTO.GameRecord;
import com.bysalem.dslist.entities.Game;
import com.bysalem.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameRecord> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameRecord(x)).toList();

    }
}
