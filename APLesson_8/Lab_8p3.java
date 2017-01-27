import java.util.Scanner;
public class Lab_8
{
	static int number;
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("");
		
		System.out.println("Please Input a Value");
		System.out.println(luck(kb.nextInt()));
	}
	
	public static int l(int number)
	{
		if (number > 0)
		{	
		if(number%10 == 7)
		{
			return 1 + l(number/10);
		}
		else
		{
			return 0 + l(number/10);
		}
		}
		else
		{
			return 0;
		}
	}
}