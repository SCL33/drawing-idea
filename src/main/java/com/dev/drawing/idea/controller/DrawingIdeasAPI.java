package com.dev.drawing.idea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drawing")
public class DrawingIdeasAPI
{
    @GetMapping("/ideas/{idea}")
    public String getIdeas (@PathVariable String idea)
    {

        return idea;

    }

}
