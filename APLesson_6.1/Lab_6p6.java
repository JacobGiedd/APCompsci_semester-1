import java.util.Scanner;
public class Lab_6p6
{
	Scanner kb;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input Word ");
		String Word =kb.next();
		
		for(int i = 0; i <= Word.length(); i++)
		{
			System.out.println(Word.substring(i));
		}
	}
} 