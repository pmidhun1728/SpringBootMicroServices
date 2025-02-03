package com.Spring.SpringBootDemo.Service;

import com.Spring.SpringBootDemo.dto.UsersDTO;
import com.Spring.SpringBootDemo.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class DTOConversion {


    public UserEntity toEntity(UsersDTO userDTO) {
        if (userDTO == null) {
            return null;
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setName(userDTO.getName());
        userEntity.setAge(userDTO.getAge());

        return userEntity;
    }

    public UsersDTO toDTO(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();
        usersDTO.setId(userEntity.getId());
        usersDTO.setName(userEntity.getName());
        usersDTO.setId(userEntity.getAge());
        return usersDTO;
    }
}
