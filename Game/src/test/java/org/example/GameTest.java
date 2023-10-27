package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class GameTest {
    private Game game;

    @BeforeEach
    public void setup(){
        game = new Game(3, 2);
    }

    @AfterEach
    public void reset(){
        game.createGrid();
    }

    @Test




}
