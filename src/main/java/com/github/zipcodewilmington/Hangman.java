package com.github.zipcodewilmington;


import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    String words[] = new String[]{ "java", "array", "zipcode", "agile", "software"};

    String randomWord = words[(int) (Math.random()) * words.length()];
    int lives = 0;

    Scanner scanner = new Scanner(System.in);







}
