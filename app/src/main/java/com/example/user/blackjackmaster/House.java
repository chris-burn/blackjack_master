package com.example.user.blackjackmaster;

import java.util.ArrayList;

/**
 * Created by user on 25/06/2017.
 */


public class House implements Playable{

    ArrayList<Card> hand;

    public int handCount(){
        return hand.size();
    }

    @Override
    public int getTotal() {
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }
        return total;
    }

    @Override
    public void drawCard(Card card) {
        hand.add(card);
    }

//    public ArrayList<Card> showHand(){
//        return hand;
//    }

//    public boolean minHand() {
//        if (House.getTotal() < 17) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
