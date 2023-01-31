package com.github.zipcodewilmington;
// T


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public Hangman(){}

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.runGame();
    }
    String[] wb = {"lakers", "eagles", "titans", "devils", "saints"};
    Scanner scanner = new Scanner(System.in);
    Random randomWord = new Random();
    int randomWordGenerator = randomWord.nextInt(6);
    int numOfGuesses = 0; // current guesses
    char[] cRW; // current random word
    char[] cGW; // current guess word


    public void runGame() {
       announceGame();
       initializeGameState();
       while (!isWordGuessed()){
           printStatus();
           process(getNextGuess());
           numOfGuesses++;
           if(numOfGuesses == 6){
               playerLoses();
           }

       }
       playerWins();
       gameOver();
       askToPlayAgain();
    }
    public void printArray(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
    public void announceGame() {
        System.out.println("Let's play Hangman");
    }

    public void gameOver() {
        System.out.println("Aw game over.");
    }

    public void initializeGameState() {
        System.out.println("Guess a letter: ");
        cGW = new char[]{'_','_','_','_','_','_'};
        cRW = wb[randomWordGenerator].toCharArray();
    }

    public Character getNextGuess() {
        System.out.println();
        return scanner.next().charAt(0);
    }

    public boolean isWordGuessed(){
        return Arrays.equals(cRW,cGW);
    }

    public void printStatus() {
        this.printArray(cGW);
    }

    public void process(Character guess) {
        for (int i = 0; i < cRW.length; i++) {
            if (cRW[i] == guess) {
                cGW[i] = cRW[i];
            }
        }
    }
    public void playerLoses() {
        System.out.println("You've ran out of guesses, you lost :(");
        askToPlayAgain();
    }

    public void playerWins() {
        System.out.println("Congrats, you won!");
        askToPlayAgain();
    }

    public void askToPlayAgain() {
        System.out.println("Do you want to play again? \n 1 for yes / 2 for no");
        int playerInput = scanner.nextInt();
        if (playerInput == 1) {
            runGame();
        } else {
            System.exit(0);
        }
    }
}
