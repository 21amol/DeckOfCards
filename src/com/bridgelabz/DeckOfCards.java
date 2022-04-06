package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {

    ArrayList<String> deck = new ArrayList<>();
    ArrayList<String> shuffledDeck = new ArrayList<>();

    public static int TOTAL_CARDS = 52;

    public void deckOfCards() {
        System.out.println("Welcome to deck of cards game.");

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck.add(ranks[i] + "--->" + suits[j]);
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
        System.out.println("\nDistribution of cards will be as follows: ");
        for (int i = 1; i <= players; i++) {
            System.out.println("Player " + i + " getting cards------>");
        }
    }

    public void shufflingOfCards() {
        int index;

        while (deck.size() > 0) {
            index = (int) (Math.random() * deck.size());
            //     System.out.println("Card number: " + index);
            shuffledDeck.add(deck.get(index));
            deck.remove(index);
        }
        System.out.println("Shuffled Cards" + shuffledDeck);
    }


    public void distributionOfCards(int players) {

        for (int i = 0; i < players; i++) {
            System.out.print("\nPlayer " + (i + 1) + " got cards:\n");
            for (int j = 0; j < 9; j++) {
                System.out.println(shuffledDeck.get((i + j * players)));
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        DeckOfCards cardsdeck = new DeckOfCards();
        cardsdeck.deckOfCards();
        int members = cardsdeck.noOfPlayers();
        cardsdeck.playersSequence(members);
        cardsdeck.shufflingOfCards();
        cardsdeck.distributionOfCards(members);
    }
}
