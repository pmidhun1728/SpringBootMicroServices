package com.Spring.SpringBootDemo.Service;

import com.Spring.SpringBootDemo.Repository.GameRepository;
import com.Spring.SpringBootDemo.dto.PlayersDTO;
import com.Spring.SpringBootDemo.entity.GameEntity;
import com.Spring.SpringBootDemo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    GameMapper gameMapper;
    @Autowired
    GameRepository gameRepository;



    public PlayersDTO saveGame(GameEntity gameEntity){
       GameEntity entity= gameRepository.save(gameEntity);
       return gameMapper.toDTO(entity);
    }

    public GameEntity saveGame(PlayersDTO playersDTO) {
        GameEntity gameEntity = gameMapper.toEntity(playersDTO);
        return gameRepository.save(gameEntity);
    }

    public List<PlayersDTO> getAll() {
         List<GameEntity> entity= gameRepository.findAll();
        List<PlayersDTO> listDtos=new ArrayList<>();
         for(GameEntity g:entity){
             listDtos.add(gameMapper.toDTO(g));
         }
        return listDtos;
    }

  public PlayersDTO savePut(PlayersDTO playersDTO){

        Optional<GameEntity> userEntity = gameRepository.findById(playersDTO.getId());
        if(userEntity.isPresent()){
            userEntity.get().setNoOfMatches(playersDTO.getNoOfMatches());
            userEntity.get().setJersyNumber(playersDTO.getJersyNumber());
        }
        else{
            System.out.println("There is no matching record found for:"+ playersDTO.getId());
        }

      return gameMapper.toDTO(userEntity.get());
  }

  public PlayersDTO saveDelete(Integer id){
        Optional<GameEntity> userReturn = gameRepository.findById(id);
        if(userReturn.isPresent()){
            gameRepository.delete(userReturn.get());
        }
        else{
            System.out.println("There is no ID matching to your deletion");
        }
      return gameMapper.toDTO(userReturn.get());
  }

}
