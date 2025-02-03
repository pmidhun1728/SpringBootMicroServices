package com.Spring.SpringBootDemo.Controller;

import com.Spring.SpringBootDemo.Service.GameService;
import com.Spring.SpringBootDemo.dto.PlayersDTO;
import com.Spring.SpringBootDemo.entity.GameEntity;
import com.Spring.SpringBootDemo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping(path = "/userEntity")
    public PlayersDTO postCall(@RequestBody GameEntity gameEntity) {
        return gameService.saveGame(gameEntity);
    }

    @GetMapping(path = "/getgame")
    public List<PlayersDTO> getUsers() {
        return gameService.getAll();
    }

    @PutMapping(path = "/putuser")
    public PlayersDTO putUsers(@RequestBody PlayersDTO playersDTO){
        return gameService.savePut(playersDTO);
    }

    @DeleteMapping(path = "/deleteuser/{id}")
    public PlayersDTO deleteUser(@PathVariable Integer id){
        return gameService.saveDelete(id);
    }
}
