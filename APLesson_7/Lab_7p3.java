import java.util.Scanner;
public class Lab_7p3
{
	static int num1;
	static int reve;
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Input a value");
		num1= kb.nextInt();
		getReverse();
		System.out.println(num1 + " reversed is " + reve);
	}
	
	public static void getReverse()
	{
		reve = 0;
		int x = num1;
		while(x>0)
		{
			reve*=10;
			reve = reve + (x % 10);
			x /= 10;
		}
	}
}