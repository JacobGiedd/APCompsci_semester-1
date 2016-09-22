import java.util.Scanner;

public class Lab_4p4
{
	public static void main(String[]args)
	{
		//FUNCTION #4
		System.out.println("*Box Export Converter*");
		system.out.println("IMPUT BOX DIMENTIONS IN INCHES");
		System.out.println();
		
		//Scanners
		Lab_4p4 form = new Lab_4p4();
		Scanner keyboard = new Scanner(System.in);
		RetMethods interest = new RetMethods();
		
		//Imputs
		System.out.println("IMPUT LENGTH");
		double l =  keyboard.nextInt();
		System.out.println("IMPUT WIDTH");
		double w =  keyboard.nextInt();
		System.out.println("IMPUT HIGHT");
		double h =  keyboard.nextInt();
		
		//Calulation
		
		double area = l * w * h;
		System.out.println(area / 1728 + " Cubic Feet");
	}
	//*********************************************************
	public double calcVol(double one, double two, double three)
	{
		return (one+two+three)/3.0;
	}
}