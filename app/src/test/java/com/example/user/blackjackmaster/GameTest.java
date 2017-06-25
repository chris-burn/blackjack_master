package com.example.user.blackjackmaster;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import deck.CardNumber;
import deck.CardSuit;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/06/2017.
 */

public class GameTest {


    Game game;
    Player player;
    ArrayList<Player> players;

    @Before
    public void before(){
        game = new Game();
        player = new Player();
        players = new ArrayList<>();
    }

    @Test
    public void canAddPlayersToPlayersArray(){
        player.drawCard(new Card(CardNumber.KING, CardSuit.DIAMONDS));
        players.add(player);
        assertEquals(1, player.handCount());
        assertEquals(1, game.playerCount());
    }

}
