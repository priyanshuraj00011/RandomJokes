package com.geekster.randomJokesApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class jokesController {
    static ArrayList<String>jokesList=new ArrayList<>();
    @PostMapping(value = "/jokes")
    public String saveJokes(@RequestBody String jokes){
         jokesList.add(jokes);
         return "save jokes";
    }
    @GetMapping(value = "/jokes")
    public String getJokes(){

        jokesList.add("I'm afraid for the calendar. Its days are numbered.");
        jokesList.add("My wife said I should do lunges to stay in shape. That would be a big step forward.");
        jokesList.add("Why do fathers take an extra pair of socks when they go golfing?");
        jokesList.add("Singing in the shower is fun until you get soap in your mouth. Then it's a soap opera.");
        jokesList.add("If April showers bring May flowers, what do May flowers bring?");
        jokesList.add("I have a joke about chemistry, but I don't think it will get a reaction.");
        jokesList.add("That car looks nice but the muffler seems exhausted.");
        jokesList.add("It takes guts to be an organ donor.");
        jokesList.add("I could tell a joke about pizza, but it's a little cheesy.");
        jokesList.add("Don't trust atoms. They make up everything!");
        jokesList.add("Is this pool safe for diving? It deep ends.");

        int randomNumber = 0 + (int)(Math.random() *((jokesList.size()-1 -0)+1));
        return jokesList.get(randomNumber);
    }
}
