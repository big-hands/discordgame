package com.bighands.discordgame.model.user;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    private String id;
    private Stats stats;

    public User() {
        stats = new Stats();
    }
}
