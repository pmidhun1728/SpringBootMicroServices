package com.Spring.SpringBootDemo.dto;

public class PlayersDTO {
    private int id;
    private int jersyNumber;
    private int noOfMatches;
    private String firstName;
    private String lastName;
    private int highestScore;

    public PlayersDTO(int id,int jersyNumber, int noOfMatches, String firstName, String lastName, int highestScore) {
        this.id=id;
        this.jersyNumber = jersyNumber;
        this.noOfMatches = noOfMatches;
        this.firstName = firstName;
        this.lastName = lastName;
        this.highestScore = highestScore;
    }

    public PlayersDTO() {}

    // Getters and Setters
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
