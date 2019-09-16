package com.bighands.discordgame.controller;

import com.bighands.discordgame.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/info")
    public ModelAndView shop() {
        return null;
    }
}
