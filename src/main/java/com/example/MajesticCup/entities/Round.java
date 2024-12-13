package com.example.MajesticCup.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "rounds")
@Data
public class Round {
    @Id
    private String id;
    private int roundNumber;
    private String competitionId;
    private List<RoundMatch> matches;


}
@Data
class RoundMatch {
    private String matchId;
    private String team1;
    private String team2;
    private Result result;
    private String winner;


}
