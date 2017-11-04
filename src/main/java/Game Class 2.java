import java.util.Scanner;

public class /*Guessing*/Game 
{	
	public void createGame() 
{		
		String userInput = "";
		int maxAmt = 0;
		int someNumber = 0;
		int counter = 0;
		int randomNumber = 0;
		boolean win = false;
		boolean isNumber = false;
		
		System.out.println("Game Started... \n\nWhat do you want to fill the jar with?");
		
		Scanner scanner1 = new Scanner(System.in);
		userInput = scanner1.nextLine();
		
		while(!userInput.matches("[a-zA-Z ,]+")) 			
		{ 
			System.out.print("Please enter a word  "); 
			userInput = scanner1.nextLine(); 
		}
		
		System.out.println("You chose to fill the jar with " + userInput+"!");
		System.out.println("");
		do
		{
		System.out.println("What is the max amount of "+ userInput +"?");
		if (scanner1.hasNextInt())
			{
		maxAmt = scanner1.nextInt();
		isNumber = true;
			}
		else
			{
		System.out.println("Please enter a whole number");
		System.out.println("");
		isNumber = false;
		scanner1.next();
			}
		} while (!(isNumber)); // end of do while loop
		
		System.out.println("You chose a max amount of "+ maxAmt + " " + userInput + "(s)");
		System.out.println("");
		
		// random / fill method
		Jar Rand = new Jar();
		randomNumber = Rand.fill(maxAmt);
		
		while (win == false)
	{
			
		do 
		{	
		System.out.println("How many "+ userInput + " are in the jar? Pick a number between 1 and "+ maxAmt);
		if (scanner1.hasNextInt())
			{
		someNumber = scanner1.nextInt();
		isNumber = true;
			}
		else{
		System.out.println("Please enter a whole number");
		System.out.println("");
		isNumber = false;
		scanner1.next();
			}
		} while (!(isNumber)); // end of nested do while loop
			
		counter++;		
		
		if (someNumber == randomNumber)
			{
			win = true;
			}
		
		else if (someNumber < randomNumber)
			{
		System.out.println("Your guess is too low, please try again");
		System.out.println("");
			} 
		
		else if (someNumber > randomNumber)
			{
		System.out.println("Your guess is too high, please try again");
		System.out.println("");
			}
	} // end while loop
		
		System.out.println("You Won!!! with "+ counter +" attempt(s)" +"\n");
		Jar jar2 = new Jar();
		jar2.endGame();
}
	
}		
		