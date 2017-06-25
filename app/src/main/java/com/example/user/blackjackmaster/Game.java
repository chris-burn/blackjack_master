package com.example.user.blackjackmaster;

import java.util.ArrayList;

/**
 * Created by user on 25/06/2017.
 */

public class Game {


//    TODO compare hands
//    TODO decide winner
//    TODO bust logic method
//    TODO extension, play game

    Player player;
    House house;
    ArrayList<Player> players;

    public Game() {
        this.player = new Player();
        this.house = new House();
        this.players = new ArrayList<>();
    }


    private void displayWinner(int result) {
        switch (result) {
            case 0:
                System.out.println("Tie!");
                break;
            case 1:
                System.out.println("Player wins");
                break;
            case -1:
                System.out.println("House wins");
        }
    }

    public void addPlayerToPlayersArray(Player player) {
        players.add(player);
    }

    public int playerCount(){
        return players.size();
    }

//    private boolean isBust(){
//
//
//    }

    public void playGame() {


        House houseTotal = house.getTotal();
        Player playerTotal = player.getTotal();

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
/
//        Player player1Total = player1.getTotal();
//        Player player2Total = player2.getTotal();
//        House houseTotal = house.getTotal();
//
//        System.out.println("Player 1 shows value of " + player1.getValue());
//        System.out.println("Player 2 shows value of " + player2.getValue());
//        System.out.println("House shows value of " + house.getValue());
//        if (house.minHand() == false){
//
//        int winner = compareHands(houseTotal, playerTotal);
//        displayWinner(winner);

    }

    private int compareHands(int houseTotal, int playerTotal) {
        if (playerTotal <= 21) && (houseTotal <= 21){

            switch (player) {
                case WIN:
                    return (houseTotal < playerTotal ? 1 : -1);
//            1 is player win, -1 is computer win
                case PAPER:
                    return (computerMove == ROCK ? 1 : -1);
                case SCISSORS:
                    return (computerMove == PAPER ? 1 : -1);
                default:
                    return 0;
            } }
    }



}
