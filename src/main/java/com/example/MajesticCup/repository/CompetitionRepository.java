package com.example.MajesticCup.repository;

import com.example.MajesticCup.entities.Competition;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompetitionRepository extends MongoRepository<Competition, String> {
}
