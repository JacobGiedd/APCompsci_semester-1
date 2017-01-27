import java.util.Scanner;
public class Lab_6p4
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("*GraphTable*");
		System.out.println("Please enter a number: ");
		double integer =kb.nextDouble();
		System.out.println("Please enter a table size: ");
		int ts = kb.next();
		
		System.out.println("x\t  ||y");
		for(double i = 1; i <= ts; i++)
		{
		 double y = i*integer;
		 
		 System.out.printf(" %f||%f \n",i,y);
		}
	}
	
	
}