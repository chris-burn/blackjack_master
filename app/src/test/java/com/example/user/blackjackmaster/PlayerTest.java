package com.example.user.blackjackmaster;

import org.junit.Before;
import org.junit.Test;

import deck.CardNumber;
import deck.CardSuit;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/06/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player();
    }

    @Test
    public void canDrawCard(){
        player.drawCard(new Card(CardNumber.KING, CardSuit.DIAMONDS));
        assertEquals(1, player.handCount());
    }

    @Test
    public void canTotalHand(){
        player.drawCard(new Card(CardNumber.SEVEN, CardSuit.SPADES));
        player.drawCard(new Card(CardNumber.TWO, CardSuit.CLUBS));
        assertEquals(9, player.getTotal());
    }


}
