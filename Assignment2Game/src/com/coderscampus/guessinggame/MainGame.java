package com.coderscampus.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		// generate random # btwn 1 & 100
		Random random = new Random();
		int randomNumber = random.nextInt(100)+1;
		Scanner scanner = new Scanner(System.in);
		
		// init the # of guesses the player has left
		int numberOfGuessesLeft = 5;
		
		//start the game loop
		while(numberOfGuessesLeft > 0) {
			//prompt player for 1st guess
			System.out.println("Pick a number between 1 and 100: ");
			int guess =scanner.nextInt();
			
			//check if guess is valid
			if(guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again: ");
				continue;}
			//check if the # is correct
			if(guess == randomNumber) {
				System.out.println("You win!");
				break;}
			
			//if guess incorrect, give player feedback
			else if(guess < randomNumber) {
				System.out.println("Pick a higher number");
			}else {
				System.out.println("Pick a lower number");
			}
		
			// reduce number of guesses each time
			numberOfGuessesLeft--;
		}
			// if the plater runs of guesses. tell them they lost
			if(numberOfGuessesLeft == 0) {
				System.out.println("You LOSE!");
				System.out.println("The number to guess was: " + randomNumber);
		}
		
		
	}


}
