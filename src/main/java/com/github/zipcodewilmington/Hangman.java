package com.github.zipcodewilmington;


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
    int wordGenerator = random.nextInt();
    int numOfLives = 0;
    String[] words = {"java", "hangman", "zipcode", "delaware", "kirkwood"};






}
