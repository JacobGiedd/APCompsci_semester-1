import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_11p6
{
	//work friday
	Scanner kb;
	public static void main(String[]agrs)
	{
		static int HEALTHLOAD = 6;
		static int healthCount;
		static String[]health;
		Scanner kb = new Scanner(System.in);
		String turn = " ";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String [HEALTHLOAD];
		
		while(!(turn.equals("q")) && healthCount > 0)
		{
			System.out.println("swictch Hit Enter");
			turn = kb.nextLine();
			damage = 1 + (int)(Math.random() * 2);
			amount = 1 + (int)(Math.random() * 6);
			
			takeDamage(damage,amount);
			printClip();
		}
		
		System.out.println("RIP!");
		System.out.println("ur mc dead...");
	}
	
	
	public static void takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount = healthCount-amount;
			System.out.println(+ amount + " Damage");
		}
		else if(healthCount + amount < HEALTHLOAD)
		{
			healthCount = amount + healthCount;
			System.out.println("Power up " + amount);
		}
		else
		{
			healthCount=HEALTHLOAD;
			System.out.println("Power up " + amount);
		}
	}
	
	public static void printClip()
	{
		String output = "Health \t";
		for(int i = 0; i < HEALTHLOAD; i++){
			if(i < healthCount)
			{
				health[i] = "[ ]";
			}
			else
			{
				health[i] = "*  ";
			}
			
			output += health[i];
		}
		
		System.out.println(output);
	}
	
	
}

////////////////////////////////////////////////////////////
