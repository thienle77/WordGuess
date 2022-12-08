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

    int numOfGuesses = 0;
    String[] wordBank = {"branch", "format", "client"};

    char[] currentRandomWord;
    char[] currentGuessWord;

    public void runGame(){
        announceGame();
        initializeGameState();
        while (currentGuessWord != currentRandomWord){
            printCurrentState();
            numOfGuesses++;
            if(numOfGuesses == '-'){
                System.exit(0);
            } if (currentGuessWord.equals(currentRandomWord)) {
                playerWins();
            }
        }
        playerLoses();
        askPlayAgain();
    }
    public void printCurrentState() {
    }
    public void initializeGameState() {
        char[] c = currentRandomWord;
        boolean gameWon = false;
        boolean playerLoses = false;
        numOfGuesses = 6;
    }
    public char[] getRandomWord(){
        Random random = new Random();
        int randIndex = random.nextInt(this.wordBank.length);
        this.currentRandomWord = this.wordBank[randIndex].toCharArray();
        return this.currentRandomWord;

    }
    public void playGame() {
        announceGame();
        gameDisplay();
    }
    public void announceGame() {
        System.out.println("Let's play Word Guess");
    }

    public void gameDisplay() {
        System.out.println("Current guesses");
        System.out.println("There are " + this.numOfGuesses + " guesses " + "left.");
    }
    public static boolean askPlayAgain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play again? (y/n)");
        String playAgain = input.nextLine();
        return playAgain.equals("y");

    }

    public void playerLoses() {
    }

    public void playerWins() {
    }






}
