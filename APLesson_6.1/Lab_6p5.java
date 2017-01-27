import java.util.Scanner;
public class Lab_6p5
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("*Counter*");
		System.out.println("Please Enter Your Number: ");
		double number =kb.nextDouble();
		System.out.println("Input Interval");
		double count = kb.nextDouble();
		
		for(int i = 0; i <= number; i += count)
		{
		System.out.print(i + "\t");
		}
	}
}