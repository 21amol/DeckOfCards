package com.bridgelabz;

import java.util.ArrayList;

public class DeckOfCards {
    ArrayList<String> deck = new ArrayList<>();
    public static final int TOTAL_CARDS = 52;

    public void deckOfCards() {
        System.out.println("Welcome to deck of cards game.");

        String[] suits = {"Clubs, Diamonds, Hearts, Spades"};
        String[] ranks = {"2,3,4,5,6,7,8,9,10,Jack,Queen,King,Ace"};

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck.add(ranks[i] + " of " + suits[j]);
            }
        }
        System.out.println("Total cards inside deck are: " + TOTAL_CARDS);
        System.out.println("Cards inside the deck....");
        for (String element : deck) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        DeckOfCards cardsdeck = new DeckOfCards();
        cardsdeck.deckOfCards();
    }
}
