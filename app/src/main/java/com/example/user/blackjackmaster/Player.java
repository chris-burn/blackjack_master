package com.example.user.blackjackmaster;

import java.util.ArrayList;

/**
 * Created by user on 25/06/2017.
 */

public class Player implements Playable {

    ArrayList<Card> hand;


    public Player() {
        this.hand = new ArrayList<>();
    }

    public int handCount() {
        return hand.size();
    }

    @Override
    public void drawCard(Card card) {
        hand.add(card);
    }

    @Override
    public int getTotal() {
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }
        return total;
    }

//    public ArrayList<Card> showHand() {
//        return hand;
//    }
}