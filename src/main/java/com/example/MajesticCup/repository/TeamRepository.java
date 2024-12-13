package com.example.MajesticCup.repository;

import com.example.MajesticCup.entities.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
}
