import java.util.Scanner;
public class Lab_7p2
{
	static int number;
	static int digits = 0;
	static int average = 0;
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("-AverageDigits-");
		System.out.println("please input a number");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	
	public static void avDigits()
	{
		
		int num = number;
		while(num > 0)
		{ 
			digits += 1;
			num /= 10; 
		}
	}
}