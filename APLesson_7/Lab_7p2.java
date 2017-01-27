import java.util.Scanner;
public class Lab_7p2
{
	static int number;
	static int digit;
	static int average = 0;
	static double Average;
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number");
		number= kb.nextInt();
		avDigits();
		System.out.println("The average of the digits is " + Average);
	}
	
	public static void avDigits()
	{
		digit = 0;
		int x = number;
		while(x>0)
		{
			digit++;
			average = average + (x % 10);
			x /= 10;
		}
		
		Average = (average/digit);
	}
}