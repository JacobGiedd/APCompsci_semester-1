import java.util.Scanner;
public class Lab_7p3
{
	static int number;
	static int digits = 0;
	static int rev = 0;
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("-ReverseNumber-");
		System.out.println("please input a number");
		number = kb.nextInt();
		getReverse();
		System.out.println(number +" reversed is " + rev);
	}
	
	public static void getReverse()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			num /= 10; 
		}
	}
}