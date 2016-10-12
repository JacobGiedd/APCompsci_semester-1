import java.util.Scanner; 

public class Lab_5
{
	static double player;
	static double computer;
	static String winner;
	
	public static void main(String[]args)
	{
		//Function
		System.out.println("*Dice Game*");
		
		//Numbers
		player = (Math.random()*7)+1;
		computer = (Math.random()*7)+1;
		
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
	}
}