import java.util.Scanner;

public class Lab_4p9
{
	//Statics
	static double l;
	static double w;
	static double perimiter;
	
	public static void main(String[]args)
	{
		//Function #5
		System.out.println("*Rectangle Perimiter*");
		
		//Scanners 
		Rectangle A = new Rectangle();
		Scanner up = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		//Imputs
		System.out.println("IMPUT LENGTH");
		l = up.nextDouble();
		up.nextLine();
		System.out.println("IMPUT WIDTH");
		l = up.nextDouble();
		up.nextLine();
		
		//prints
		PerimCalc();
		print();
		
		
	}
		//Calculator
	public static void PerimCalc()
	{
		perimeter = 2*l + 2*w;
	}
	public static void print()
	{
		//prints
		System.out.println("Your rectangle is " + perimiter + "sq ft around. ");
	}
}