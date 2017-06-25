package com.example.user.blackjackmaster;

import java.util.ArrayList;

import deck.CardNumber;
import deck.CardSuit;

/**
 * Created by user on 25/06/2017.
 */

public class Game {

    Player player;
    House house;
    ArrayList<Player> players;

    public Game() {
        this.player = new Player();
        this.house = new House();
        this.players = new ArrayList<>();
    }


    public void addPlayerToPlayersArray(Player player) {
        players.add(player);
    }

    public int playerCount(){
        return players.size();
    }


//    TODO compare hands
//    TODO decide winner
//    TODO bust logic method
//    TODO extension, play game


//    public void playGame() {
//
//
//        House houseTotal = house.getTotal();
//        Player playerTotal = player.getTotal();
//
//        Dealer populates deck (dealer.populateDeck();)
//        Dealer shuffles deck (dealer.shuffleDeck();) separate function
//        Dealer deals first card to each player
//        Each player draws first card into deck
//        Dealer deals first card to house
//        Dealer draws first card into house Deck
//        Dealer deals second card to each player
//        Each player draws second card into deck
//        PLayers and house show hands (house shows one card)
//        Dealer deals second card to house
//        Dealer draws second card into house Deck
//        player1 asked to stick or deal
//        if stick: move to player 2
//        if deal: Dealer deals third card to player1
//        player1 draws third card to deck
//        show player1 total
//        BUST LOGIC:
//        if total > 21, shows player BUST, clear player arrayList & move to player 2
//        if total <= 21, player1 asked to stick or deal
//        REPEAT UNTIL STICK or BUST
//        repeat with player2 ...

//        house shows full hand
//        if total under 17: dealer asked to deal,
//        Dealer deals third card to house
//        Dealer draws third card to house deck
//        show new house total
//        if total > 21, house BUST, display winner (players, BUST = false)
//        if total <= 21, house asked to stick or deal
//
//        if total 17 or over: dealer asked to stick or deal
//        if stick: go to int winner = compareHands()
//        if deal:
//        Dealer deals third card to house
//        Dealer draws third card to house deck
//        show new house total
//        if total > 21, house BUST, display winner (players, BUST = false)
//        if total <= 21, house asked to stick or deal
//        REPEAT until house stick or BUST
//        COMBINE all player hands to new ArrayList (addPlayertoPlayersArray(player 1) etc;
//        compare Player and house hands (int winner = compareHands()) return 0,1 or -1
//        display winner (house or Players)
//
//
//        System.out.println("Player 1 shows value of " + player1.getValue());
//        System.out.println("Player 2 shows value of " + player2.getValue());
//        System.out.println("House shows value of " + house.getValue());
//        if (houseTotal <= 17),
//
//        int result = compareHands(houseTotal, playerTotal);
//        displayWinner(result);
//    }


//    private int compareHands(Player playerTotal, House houseTotal) {
//        for (Player player : players){
//            if (playerTotal == houseTotal){
//                return 0;}
//                    if (player.getTotal() < house.getTotal());{
//                return -1;}
//            else (player.getTotal() > house.getTotal();{
//                return 1;}
//        }
//    }
//
//
//    private void displayWinner(int result) {
//        switch (result) {
//            case 0:
//                System.out.println("Tie!");
//                break;
//            case 1:
//                System.out.println("Player wins");
//                break;
//            case -1:
//                System.out.println("House wins");
//        }
//    }

//    private boolean isBust(){
//
//
//    }


}
