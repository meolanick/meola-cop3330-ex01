/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = name.nextLine();
        System.out.println("Hello, " + userName + ", nice to meet you.");
    }

}
