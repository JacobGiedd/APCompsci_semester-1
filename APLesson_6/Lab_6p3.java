import java.util.Scanner;
public class Lab_6p3
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.next();
		
		
		
		for(int i = 0; i <= word.length(); i++)
		{
			System.out.println(word.substring(0, i));
		}
		
	}
	
}