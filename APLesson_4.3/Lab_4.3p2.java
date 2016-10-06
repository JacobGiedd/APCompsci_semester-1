import java.util.Scanner;

public class Lab_4.3p2
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	
	public static void main(String[]args)
	{
		//Function #6
		System.out.println("*Average*");
		
		//Scanners 
		Scanner keyboard = new Scanner(System.in);
		Lab_4.3p2 loan = new Lab_4.3p2();
		
		//Imputs
		System.out.println("Imput num1");
		double num1 =  keyboard.nextInt();
		System.out.println("Imput num2");
		double num2=  keyboard.nextInt();
		System.out.println("Imput num3");
		double num3 =  keyboard.nextInt();
		
		
	}
		//Calculator
	public static void calcAvg()
	{
		average = (num1 + num2 + num3)/3.0;
	}
	
	public static void print()
	{
		return
	}
}