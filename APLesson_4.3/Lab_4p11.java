import java.util.Scanner;

public class Lab_4p11
{
	static float output;
	static float side;
	static float a;
	
	public static void main(String[]args)
	{
		//Function #7
		System.out.println("*Surface area Cube*");
		
		//Scanners
		Scanner keyboard = new Scanner(System.in);
		Scanner up = new Scanner(System.in);
		
		//Imputs 
		System.out.println("Imput Side Length");
		double side = keyboard.nextInt();
		System.out.println("Imput Side Area");
		a = up.nextFloat();
		up.nextLine();
		
		
		SACalc();
		print();
		
	}
	//Calculator
	public static void SACalc()
	{
		output = side * a;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f", output);
	}
}