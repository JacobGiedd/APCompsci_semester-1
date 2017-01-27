import java.util.Scanner;
public class Lab_6p2
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("*Factorial*");
		System.out.println("Please enter a number: ");
		double number =kb.nextInt();
		double result = 1;
		for(double totalint = number; number > 0; number--)
		{
			result = number*result;
		}
			System.out.println("Factorial is" + result);
	}
}