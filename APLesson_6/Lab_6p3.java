import java.util.Scanner;
public class Lab_6p3
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("*ReverseTriangle*");
		System.out.println("Enter Your Word");
		String Word =kb.next();
		
		for(int i = Word.length(); i >= 0; i--)
		{
			System.out.println(Word.substring(0,i));
		}
	}
}