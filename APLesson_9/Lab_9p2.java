import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_9p2
{
	
	public static void main(String[]args)
	{
		String[] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		first(words);
	}
	
	public static void first(String[] w)
	{
		
		for(int i = 0; i < w.length; i++)
		{
			System.out.println(w[i].charAt(0));
		}
	}
}