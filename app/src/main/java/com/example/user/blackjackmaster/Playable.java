package com.example.user.blackjackmaster;

import java.util.ArrayList;

/**
 * Created by user on 25/06/2017.
 */

public interface Playable {

    // lists method names that have to be included on those classes implementing the Interface

    void drawCard(Card card);
    int getTotal();
    ArrayList<Card> showHand();


//    public void getHand();
}
