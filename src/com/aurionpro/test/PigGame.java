package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;



public class PigGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int turnScore;
        int noOfTurns=0;
        System.out.println("Let's Play PIG!\n");

        for (int turn = 1; totalScore < 20; turn++) {
        	noOfTurns =turn;
            turnScore = 0;
            System.out.println("TURN " + turn);

            while (true) {
                System.out.print("Roll or hold? (r/h): ");
                char choice = scanner.next().charAt(0);

                if (choice == 'r') {
                    int die = random.nextInt(6) + 1;
                    System.out.println("Die: " + die);

                    if (die == 1) {
                        System.out.println("Turn over. No score.");
                        break;
                    } else {
                       
                        totalScore+=die;
                        turnScore += die;
                        if(totalScore>20)
                        	break;
                    }
                } else if (choice == 'h') {
                    totalScore += turnScore;
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + totalScore);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'r' or 'h'.");
                }
            }
        }

        System.out.println("\nYou finished in "+noOfTurns+" turns" );
}
}
