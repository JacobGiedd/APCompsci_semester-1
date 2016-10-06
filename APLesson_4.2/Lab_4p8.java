import java.util.Scanner;

public class Lab_4p8
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		//Function #8
		System.out.println("*Area Circle*");
		
		//Scanners
		Scanner keyboard = new Scanner(System.in);
		Lab_4p8 loan = new Lab_4p8();
		
		//Imputs 
		System.out.println("Imput Radius");
		double r =  keyboard.nextInt();
	}
		//Calculator
	public static void calcArea()
	{
		area = 3.14 * r * r;
	}
	
	public static void print()
	{
		return
	}
}