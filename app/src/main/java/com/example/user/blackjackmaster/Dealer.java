package com.example.user.blackjackmaster;

import java.util.ArrayList;
import java.util.Collections;

import deck.CardNumber;
import deck.CardSuit;

/**
 * Created by user on 25/06/2017.
 */

public class Dealer {

    private ArrayList<Card> deck;
    House house;

    public Dealer(){
        this.deck = new ArrayList<Card>();
//        populateDeck();
    }

    public void populateDeck() {
        for (CardSuit type : CardSuit.values()){
            for (CardNumber number : CardNumber.values()){
                deck.add(new Card(number, type));
            }
        }
    }


    public int getDeckSize() {
        return deck.size();
    }

    public Card dealCard() {
        return deck.remove(0);
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }


}
