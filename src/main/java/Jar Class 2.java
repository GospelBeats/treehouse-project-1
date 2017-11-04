import java.util.Scanner;
import java.util.Random;
public class Jar 
{
	
public void getName(){
		System.out.println("Hello, Welcome to \"Guess how many are in the jar game!\"" + "\n");
		System.out.println("What is your name? --> ");
		Scanner userInput = new Scanner(System.in);
		String username = userInput.nextLine();
		while(!username.matches("[a-zA-Z ,]+")) 			
		{ 
			System.out.print("Please retype name  "); 
			username = userInput.nextLine(); 
		}
		System.out.println("Hello " + username +"!");
		}

public int fill(int mA){
	Random random = new Random();
	int randomNumber = 1 + random.nextInt(mA);
	return randomNumber;
	}	

public void startGame(){
	String playGame = "";
	/*Guessing*/Game game1 = new /*Guessing*/Game();
	
	System.out.println("Do you want to play \"Guess how many are in the jar?\"");
		
	Scanner userInput = new Scanner(System.in);
	playGame = userInput.nextLine();
		
	while (playGame.equalsIgnoreCase("yes")){
		game1.createGame();
	}
	if (playGame.equalsIgnoreCase("no")){
		System.out.println("Game Over,  \n\n...Good bye");
		System.exit(0);
	}else {
		System.out.println("please enter \"yes\" or \"no\"");
		System.out.println("");
		startGame();
	}
	userInput.close();
	}

public void endGame(){
	String endGame = "";
	/*Guessing*/Game game2 = new /*Guessing*/Game();
	
	System.out.println("Do you want to play again? ");
		
	Scanner userInput = new Scanner(System.in);
	endGame = userInput.nextLine();
		
	while (endGame.equalsIgnoreCase("yes")){
		game2.createGame();
	}
	if (endGame.equalsIgnoreCase("no")){
		System.out.println("Game Over,  \n\n...Good bye");
		System.exit(0);
	}else {
		System.out.println("please enter \"yes\" or \"no\"");
		System.out.println("");
		endGame();
	}
	userInput.close();
	}
}
