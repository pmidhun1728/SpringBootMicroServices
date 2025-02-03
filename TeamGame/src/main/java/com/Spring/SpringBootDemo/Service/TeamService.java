package com.Spring.SpringBootDemo.Service;

import com.Spring.SpringBootDemo.Repository.UserRepository;
import com.Spring.SpringBootDemo.dto.UsersDTO;
import com.Spring.SpringBootDemo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    DTOConversion dtoConversion;


    private static List<UsersDTO> listUsers = new ArrayList<>();
    private static int count = 0;

    public List<UserEntity> userService() {
        List<UserEntity> findAll = userRepository.findAll();
        return findAll;
    }

    public UsersDTO save(UserEntity userEntity) {
       UserEntity user = userRepository.save(userEntity);
       return dtoConversion.toDTO(user);
    }

}

