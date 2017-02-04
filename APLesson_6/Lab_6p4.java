import java.util.Scanner;
public class Lab_6p4
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner up = new Scanner(System.in);
		//*START USE UP NOT KB*Scanner kb = new Scanner(System.in);
		System.out.println("*GraphTable*");
		System.out.println("Please enter a number: ");
		int num = up.nextInt();
		up.nextLine();
		System.out.println("Please enter a table size: ");
		int size = up.nextInt();
		System.out.println("|f(x)|  x |");
		
	
		for(int i = 1; i <= size; i++)
		{
		num = num * i;
		 
		 System.out.printf("|%3s | %2s |\n", num, i);
		}
	}
	
	
	
}