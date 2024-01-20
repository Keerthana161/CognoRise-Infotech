package cogrise;
import java.util.Random;
import java.util.Scanner;

public class Numberguessing {
	    public static void main(String[] args) {
	         
	        Random random = new Random();
	        int randomNumber = random.nextInt(100) + 1;  
	        Scanner scanner = new Scanner(System.in);

	       
	        int attempts = 0;
	        final int maxAttempts = 7;  

	        System.out.println( "Welcome to the number guessing game!");
	        System.out.println("Try to guess the number between 1 and 100.");

	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            int userGuess = scanner.nextInt();
	            attempts++;

	             
	            if (userGuess == randomNumber) {
	                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                break;
	            } else if (userGuess < randomNumber) {
	                System.out.println("Your guess is too low. Try again.");
	            } else {
	                System.out.println( "Your guess is too high. Try again.");
	            }

	             
	            int remainingAttempts = maxAttempts - attempts;
	            if (remainingAttempts > 0) {
	                System.out.println("You have " + remainingAttempts + " attempts remaining.\n");
	            } else {
	                System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
	            }
	        }

	        
	        scanner.close();
	    }
	}

 
