import java.util.Scanner;

public class Lab_4p7
{
	static double sl;
	static double surface area;
	
	public static void main(String[]args)
	{
		//Function #7
		System.out.println("*Surface area Cube*");
		
		//Scanners 
		Scanner keyboard = new Scanner(System.in);
		Lab_4p7 loan = new Lab_4p7();
		
		//Imputs
		System.out.println("Imput Side Length");
		double sl =  keyboard.nextInt();
	}
		//Calculator
	public static void calcSurf()
	{
		surface area = 6 * sl *sl;
	}
	
	public static void print()
	{
		return
	}
}