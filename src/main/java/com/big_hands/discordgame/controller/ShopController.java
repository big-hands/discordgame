package com.big_hands.discordgame.controller;

import com.big_hands.discordgame.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PostMapping("/shop")
    public ModelAndView shop() {
        return null;
    }
}
