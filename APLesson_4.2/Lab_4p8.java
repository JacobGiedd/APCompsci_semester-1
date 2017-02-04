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
		Scanner up = new Scanner(System.in);
		Circle a = new Circle();
		
		//Imputs 
		System.out.println("Imput Radius");
		r = up.nextDouble();
		up.nextLine();
		double area = a.CircCalc(r);
		
		//prints
		System.out.printf("The area of circle with a radius of " + r + " is " + "%.5f", area);
	}
	
		//Calculator
	public double CircCalc(Double r)
	{
		return Math.pow(r, 2) * Math.PI; 
	}
}