import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int lowerBound = 1;
int upperBound = 100;
int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
int numberOfAttempts = 0;
boolean hasGuessedCorrectly = false;
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("I have selected a random number between 1 and 100.");
System.out.println("Try to guess it!");
while (!hasGuessedCorrectly) {
System.out.print("Enter your guess: ");
int userGuess = scanner.nextInt();
numberOfAttempts++;
if (userGuess < lowerBound || userGuess > upperBound) {
System.out.println("Please enter a number between 1 and 100.");
} else if (userGuess < randomNumber) {
System.out.println("Try a higher number.");
} else if (userGuess > randomNumber) {
System.out.println("Try a lower number.");
} else {
hasGuessedCorrectly = true;
System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + numberOfAttempts + " attempts.");
}
}
scanner.close();
}
}