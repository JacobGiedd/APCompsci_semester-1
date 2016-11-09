import java.util.Scanner;
public class Lab_8
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("-Underscores-");
		System.out.println("please enter your number: ");
		System.out.println(countDigits(kb.nextInt()));
	}
	public static int countDigits(int num)
	{
		while(num > 0)
		{
			return 1 + (countDigits(num/10));
		}
		return 0;
	}
}