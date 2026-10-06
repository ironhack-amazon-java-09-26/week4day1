package com.ironhack.hellospring.controller;


import com.ironhack.hellospring.model.Game;
import com.ironhack.hellospring.model.GameGenre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/games") //suele ser el nombre del recurso en plural
public class GameController {

    @GetMapping
    public String hello(){
        return "Hello from GameController!";
    }

    @GetMapping("/one")
    public Game getOne(){
        Game game = new Game("The Witcher 3 Remastered", GameGenre.RPG);
        return game;
    }

@GetMapping("/all")
    public List<Game> getAll(){
        List<Game> games = new ArrayList<>();
        games.add(new Game("Bloodborne", GameGenre.RPG));
        games.add(new Game("Animal Crossing: New Horizons", GameGenre.STRATEGY));
        games.add(new Game("Super Smash Bros Ultimate", GameGenre.ADVENTURE));
        games.add(new Game("Zelda: Breath of the Wild", GameGenre.ADVENTURE));
        return  games;
    }
}
