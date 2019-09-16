package com.bighands.discordgame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class GameUpdateService {
    @Autowired
    private UserService userService;

    @Scheduled(fixedRate = 1000)
    public void updateGameStats() {
        userService.getAllUsers().forEach(user -> {
            user.getStats().update();
            userService.saveUser(user);
        });
    }
}
