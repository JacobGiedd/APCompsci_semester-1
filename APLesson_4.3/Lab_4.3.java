import java.util.Scanner;

public class Lab_4p5
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
		Scanner keyboard = new Scanner(System.in);
		Lab_4p5 loan = new Lab_4p5();
		
		//Imputs
		System.out.println("IMPUT LENGTH");
		l =  keyboard.nextInt();
		System.out.println("IMPUT WIDTH");
		w =  keyboard.nextInt();
		print(calcPerim(l, w));
	}
		//Calculator
	public static void calcPerim()
	{
		perimiter = 2 * (l + w);
	}
	public static void print(int perimiter)
	{
		//prints
		System.out.println("Your rectangle is " + perimiter + "sq ft around. ");
	}