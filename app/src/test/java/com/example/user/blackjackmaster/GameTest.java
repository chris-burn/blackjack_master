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
    }

//    @Test
//    public void canAddPlayersToPlayersArray(){
//        player.drawCard(new Card(CardNumber.KING, CardSuit.DIAMONDS));
//        assertEquals(1, player.handCount());
//        players.add(player);
//        assertEquals(1, players.playerCount());
//    }
}
