import java.util.Scanner;

public class Lab_4p6
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
		Scanner up = new Scanner(System.in);
		Average mean = new Average();
		
		//Imputs
		System.out.println("Imput num1");
		double num1 =  keyboard.nextInt();
		System.out.println("Imput num2");
		double num2=  keyboard.nextInt();
		System.out.println("Imput num3");
		double num3 =  keyboard.nextInt();
		
		double avg = mean.average(num1, num2, num3);
		
		System.out.printf("The average of " + "%.5f " + "%.5f " + "and "+ "%.5f " + "is " + "%.5f.", num1, num2, num3, average);
	}
		//Calculator
	public double average(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
}
	