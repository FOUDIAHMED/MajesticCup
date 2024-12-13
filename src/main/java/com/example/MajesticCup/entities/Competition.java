package com.example.MajesticCup.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//
@Document(collection = "competitions")
@Data
public class Competition {
    @Id
    private String id;
    private String name;
    private int numberOfTeams;
    private List<String> teams;
    private int currentRound;
    private List<String> rounds;

}
