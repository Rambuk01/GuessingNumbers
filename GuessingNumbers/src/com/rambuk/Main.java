package com.rambuk;

import java.util.Scanner;

// This program is supposed to generate a random number between 1 and 300, and let you type in your gues. It will let you know if your gues was too high or too low.
// When you correctly guess the number, the program will ask if you wish to finish or try again. It also needs to print the score.
// Later, I could create a score textfile, that saves the highscores... the lower the better.
// Next time i revisit this game. I should make a GUI for it.
public class Main {
    private static int attempts = 0;
    private static boolean guessing = true;

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to Guessing Numbers! This is the amazing game of guessing numbers");
        System.out.println("Start by typing in the min and max value you wish to gues between...");
        System.out.println("Minimum Value");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int minValue = scanner.nextInt();
            System.out.println("Maximum Value:");
            int maxValue = scanner.nextInt();
            // Loopbreaker. If user chooses 0, 0.
            if (minValue == 0 && maxValue == 0) {
                break;
            }
            System.out.println("Random number between " + minValue + " and " + maxValue + " is now generated.");
            NumberContainer nc = new NumberContainer(minValue, maxValue);
            System.out.println("What's your gues?");
            while(guessing) {
               int gues = scanner.nextInt();
               attempts++;
               if(gues == nc.getNumber()) {
                   System.out.println("Correct! The number was: " + nc.getNumber());
                   System.out.println("Number of attempts: " + attempts);
                   guessing = false;
               } else if(gues < nc.getNumber()) {
                   System.out.println("Too low. Try again.");
               } else {
                   System.out.println("Too high. Try again.");
               }
            }

            System.out.println("Well done. If you wish end the game. Set Min and Max value to 0");
            System.out.println("Game restarting");
        }

    }
}
