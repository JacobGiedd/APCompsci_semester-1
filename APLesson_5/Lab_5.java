import java.util.Scanner; 

public class Lab_5
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		//Function
		System.out.println("*Dice Game*");
		
		//Numbers
		int player = (int)(Math.random()*6)+1;
		int computer = (int)(Math.random()*6)+1;
		
		diceRoll();
		
		//Print statements
		System.out.println("you rolled a " + computer);
		System.out.println("Dice AI rolled a " + computer);
		System.out.println("And the winner is!..." + winner);
	}
		//If statements
	public static void diceRoll()
	{
		if (player > computer)
			winner = "Player";
		if (computer > player)
			winner = "Dice AI";
		if (computer == player)
			winner = "lmao it's a tie";
	}
}