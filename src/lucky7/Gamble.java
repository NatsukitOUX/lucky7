package lucky7;
import java.util.Random;
import java.util.Scanner;
public class Gamble {

	public static void main(String[] args) {
		
		
	
		        Random random = new Random();
		        Scanner scanner = new Scanner(System.in);

		        int money = 5; // Player starts with 5€

		        while (money > 0) {
		            // Deduct 1€ for playing the game
		            money -= 1;
		            System.out.println("You have " + money + "€ left.");

		            int number1 = random.nextInt(10) + 1;
		            int number2 = random.nextInt(10) + 1;
		            int number3 = random.nextInt(10) + 1;

		            System.out.println("Random Number 1: " + number1);
		            System.out.println("Random Number 2: " + number2);
		            System.out.println("Random Number 3: " + number3);

		            if (number1 == 7 || number2 == 7 || number3 == 7) {
		                if (number1 == 7 && number2 == 7 && number3 == 7) {
		                    money += 10; // Player wins 10€ for all sevens
		                    System.out.println("Congratulations! You won 10€!");
		                } else if (number1 == 7 && number2 == 7 || number1 == 7 && number3 == 7 || number2 == 7 && number3 == 7) {
		                    money += 5; // Player wins 5€ for two sevens
		                    System.out.println("Congratulations! You won 5€!");
		                } else {
		                    money += 3; // Player wins 3€ for one seven
		                    System.out.println("Congratulations! You won 3€!");
		                }
		            } else {
		                System.out.println("You lost.");
		            }

		            // Ask if the player wants to play again
		            System.out.print("Do you want to play again? (yes/no): ");
		            String playAgain = scanner.next().toLowerCase();

		            if (!playAgain.equals("yes")) {
		                System.out.println("Thanks for playing! You finished with " + money + "€.");
		                break; // Exit the loop if the player doesn't want to play again
		            }
		        }

		       
		    }
		


	}


