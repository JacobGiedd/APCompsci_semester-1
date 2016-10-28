import java.util.Scanner;

public class Lab_4p3
{
	public static void main(String[]args)
	{
		//FUNCTION #3
		System.out.println("*Compound Interest Calculator*");
		
		//Scanners
		Lab_4p3 form = new Lab_4p3();
		Scanner keyboard = new Scanner(System.in);
		RetMethods calcAvg = new RetMethods();
		
		//Imputs
		System.out.println("IMPUT INTEREST RATE");
		double r =  keyboard.nextInt();
		System.out.println("IMPUT RRINCIPAL");
		double p =  keyboard.nextInt();
		System.out.println("IMPUT ANUAL COMPOUNDED QUANITY");
		double n =  keyboard.nextInt();
		System.out.println("IMPUT LOAN LIFE");
		double t =  keyboard.nextInt();
		
		
		double avg = calcAvg(r, p, n, t));
		System.out.printf("YOUR TOTAL MONTHLY PAYMENT IS $ %10.2f\n" + avg);
	}
		//Calcuulator
	public double calcAvg(double one, double two, double three, double four)
	{
		return (one+two+three+four)/3.0;
	}
}