package com.bighands.discordgame.repository;

import com.bighands.discordgame.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findById(String id);
}
