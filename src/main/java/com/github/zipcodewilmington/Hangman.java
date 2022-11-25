package com.github.zipcodewilmington;
// T

import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public Hangman () {}

    public static void main (String[] args) {
        Hangman game = new Hangman();
        game.playGame();
    }

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int wordGenerator = random.nextInt(6);
    int numOfGuesses = 0;
    String[] wordBank = {"java", "hangman", "zipcode", "delaware", "kirkwood", "target"};

    Character[] randomWord;
    Character[] displayWord;

    private void playGame() {
        gameDisplay();
        announceGame();
    }

    private void gameDisplay() {
    }

    private void announceGame() {
    }

}
