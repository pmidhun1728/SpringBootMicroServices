package com.Spring.SpringBootDemo.Repository;

import com.Spring.SpringBootDemo.entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameEntity, Integer> {

}
