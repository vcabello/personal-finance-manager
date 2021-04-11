package org.victor.cabello.dev.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyController {

    @GetMapping("/money")
    public String getMoney() {
        return "Hi!";
    }

}
