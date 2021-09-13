/*
 *  UCF COP3330 Fall 2021 Assignment 1.8 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("How many people? "); //Asking for user input
        int people = x.nextInt(); //Storing user input
        System.out.print("How many pizzas do you have? ");
        int pizzas = x.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = x.nextInt();

        int total = pizzas * slices;
        int slicesplit = total / people; //Calculations
        int leftover = total % people; //Mod to have even num

        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, total); //Printing
        System.out.printf("Each person gets %d pieces of pizza.\n", slicesplit);
        System.out.printf("There are %d leftover pieces.\n", leftover);
    }
}