package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
    //  static Scanner scanner = new Scanner(System.in);
    // static int players = scanner.nextInt();

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

    public int noOfPlayers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the no. of players");
        int players = scan.nextInt();
        if (players > 2 && players <= 4) {
            System.out.println("The game starts");
        } else {
            System.out.println("Required players to play the game are more than 2 and Max 4");
        }
        return players;
    }

    public void playersSequence(int players) {
        System.out.println("Distribution of cards will be as follows: ");
        for (int i = 1; i <= players; i++) {
            System.out.println("Player " + i + " getting cards------>");
        }
    }

    public static void main(String[] args) {
        DeckOfCards cardsdeck = new DeckOfCards();
        cardsdeck.deckOfCards();
        int members = cardsdeck.noOfPlayers();
        cardsdeck.playersSequence(members);
    }
}
