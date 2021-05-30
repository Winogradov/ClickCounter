package com.example.winogradov.clicker.controller;


import com.example.winogradov.clicker.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ClickController {

    @Autowired
    private CounterService counterService;

    @MessageMapping("/count")
    @SendTo("topic/click")
    public int incrementCounter(){
        return counterService.incrementCounterAndGet();
    }

    @MessageMapping("/current")
    @SendTo("/topic/click")
    public int getCurrentClickCount() {
        return counterService.getCurrentClickCount();
    }

}