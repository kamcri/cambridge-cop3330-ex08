/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner peopleScan = new Scanner(System.in);
        System.out.println("How many people?");
        int people = peopleScan.nextInt();

        Scanner pizzaScan = new Scanner(System.in);
        System.out.println("How many pizzas do you have?");
        int pizzas = pizzaScan.nextInt();

        Scanner sliceScan = new Scanner(System.in);
        System.out.println("How many slices per pizza?");
        int slices = sliceScan.nextInt();

        int totalSlices = pizzas * slices;

        if (totalSlices/people == 1)
        {
            System.out.println(people + " people with " + pizzas + " pizza (" + totalSlices + " slices)");
        }
        else
        {
            System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");
        }

        int getPizza = totalSlices / people;
        System.out.println("Each person gets " + getPizza + " slices of pizza.");

        int leftovers = totalSlices % people;
        System.out.println("There are " + leftovers + " slices leftover.");
    }
}
