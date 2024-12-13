package com.example.MajesticCup.repository;

import com.example.MajesticCup.entities.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match, String> {
}
