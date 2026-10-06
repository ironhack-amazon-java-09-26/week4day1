package com.ironhack.hellospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // añade getters, setters, toString, equals y hashCode
@AllArgsConstructor // añade un constructor con todos los atributos
public class Game {
    private String name;
    private GameGenre genre;
}
