package com.example.MajesticCup.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "teams")
@Data

public class Team {
    @Id
    private String id;
    private String name;
    private String city;
    private List<Player> players;

    // Getters and setters
}

class Player {
    private String id;
    private String name;
    private String surname;
    private String position;
    private int number;

    // Getters and setters
}
