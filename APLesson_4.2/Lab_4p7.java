import java.util.Scanner;

public class Lab_4p7
{
	static double side;
	static double SA;
	static double a;
	public static void main(String[]args)
	{
		//Function #7
		System.out.println("*Surface area Cube*");
		
		//Scanners 
		Scanner up = new Scanner(System.in);
		Cube sa = new Cube();
		side = 6;
		
		//Imputs
		System.out.println("Imput Side Length");
		a = up.nextDouble();
		up.nextLine();
		SA = sa.SACalc(side, a);
		
		//prints
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f", SA);
	}
		//Calculator
	public double SACalc(double side, double a)
	{
		surface area = 6 * sl *sl;
		return side * a;
	}
}