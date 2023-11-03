package guessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int max = 100;
        int number2Guess = randomNumber.nextInt(max);

        guessingGame(number2Guess);

    }

    private static void guessingGame(Integer number2Guess){
        int guessedNumber;
        int rounds = 3;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Welcome to the Guessing Game!");
            System.out.println("You have " + rounds + " chances to guess the number.");
            System.out.println("Please enter a new number: ");
            guessedNumber = sc.nextInt();
            rounds--;
            if(number2Guess == guessedNumber){
                System.out.println("Congrats! YOU WON!");
                return;
            }
            if(rounds == 0){
                System.out.println("Awww! YOU LOST!");
                System.out.println("The number was: " + number2Guess);
            }
        }while(rounds > 0);
    }


}
