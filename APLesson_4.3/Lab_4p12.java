import java.util.Scanner;

public class Lab_4p12
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		//Function #8
		System.out.println("*Area Circle*");
		
		//Scanners
		Scanner keyboard = new Scanner(System.in);
		//*dont need* Lab_4.3p4 loan = new Lab_4.3p4();
		Scanner up = new Scanner(System.in);
		
		//Imputs 
		System.out.println("Imput Radius");
		double r =  keyboard.nextInt();
		
		CircCalc();
		print();
	}
		//Calculator
	public static void CircCalc()
	{
		A = Math.pow(r, 2) * Math.PI; 
	}
	public static void print()
	{
		System.out.printf("The area of circle with a radius of " + r + " is " + "%.5f", A);
	}
}