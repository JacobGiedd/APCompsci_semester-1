import java.util.Scanner;
public class Lab_7
{
	static int number;
	static int sum = 0;
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("*DIGIT ADDER*");
		System.out.println("-Please Imput Value-");
		number= kb.nextInt();
		sumDigits();
		System.out.println("The sum of all values is " + sum);
	}
	
	public static void sumDigits()
	{
		int num = number;
		while(num>0)
		{
			sum = sum + (num % 10);
			num /= 10;
		}
	}
}