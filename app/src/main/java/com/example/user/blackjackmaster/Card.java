package com.example.user.blackjackmaster;

import deck.CardSuit;
import deck.CardNumber;

/**
 * Created by user on 25/06/2017.
 */

public class Card {

    CardNumber cardNumber;
    CardSuit cardSuit;

    public Card(CardNumber cardNumber, CardSuit cardSuit){
        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }

    public CardNumber getCardNumber() {
        return cardNumber;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public int getValue(){
        return cardNumber.getNumber();
    }
}
