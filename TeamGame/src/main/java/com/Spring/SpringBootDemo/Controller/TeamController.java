package com.Spring.SpringBootDemo.Controller;

import com.Spring.SpringBootDemo.Service.DTOConversion;
import com.Spring.SpringBootDemo.Service.TeamService;
import com.Spring.SpringBootDemo.dto.UsersDTO;
import com.Spring.SpringBootDemo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;
    @Autowired
    private DTOConversion dtoConversion;


    @GetMapping(path = "/getuser")
    public List<UserEntity> getUsers(){
        return teamService.userService();
    }

    @PostMapping(path="/user")
    public UsersDTO postUser(@RequestBody UsersDTO userdto){

        UsersDTO  usersDTO= teamService.save(dtoConversion.toEntity(userdto));
        return usersDTO;
    }

}
