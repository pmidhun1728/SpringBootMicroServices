package com.Spring.SpringBootDemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "jersy_number")
    private int jersyNumber;

    @Column(name = "no_of_matches")
    private int noOfMatches;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "highest_score")
    private int highestScore;

    public GameEntity(int id, int jersyNumber, int noOfMatches, String firstName, String lastName, int highestScore) {
        this.id = id;
        this.jersyNumber = jersyNumber;
        this.noOfMatches = noOfMatches;
        this.firstName = firstName;
        this.lastName = lastName;
        this.highestScore = highestScore;
    }

    // No-argument constructor (required by JPA)
    public GameEntity() {}

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJersyNumber() {
        return jersyNumber;
    }

    public void setJersyNumber(int jersyNumber) {
        this.jersyNumber = jersyNumber;
    }

    public int getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(int noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }
}
