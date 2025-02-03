package com.Spring.SpringBootDemo.Service;

import com.Spring.SpringBootDemo.dto.PlayersDTO;
import com.Spring.SpringBootDemo.entity.GameEntity;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {

    // Convert GameEntity to PlayersDTO
    public PlayersDTO toDTO(GameEntity gameEntity) {
        if (gameEntity == null) {
            return null;
        }

        return new PlayersDTO(
                gameEntity.getId(),
                gameEntity.getJersyNumber(),
                gameEntity.getNoOfMatches(),
                gameEntity.getFirstName(),
                gameEntity.getLastName(),
                gameEntity.getHighestScore()
        );
    }

    // Convert PlayersDTO to GameEntity
    public GameEntity toEntity(PlayersDTO playersDTO) {
        if (playersDTO == null) {
            return null;
        }

        return new GameEntity(
                0, // ID is auto-generated, set to 0 or ignore
                playersDTO.getJersyNumber(),
                playersDTO.getNoOfMatches(),
                playersDTO.getFirstName(),
                playersDTO.getLastName(),
                playersDTO.getHighestScore()
        );
    }
}
