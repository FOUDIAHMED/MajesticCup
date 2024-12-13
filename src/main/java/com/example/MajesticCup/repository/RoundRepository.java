package com.example.MajesticCup.repository;

import com.example.MajesticCup.entities.Round;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoundRepository extends MongoRepository<Round, String> {
}
