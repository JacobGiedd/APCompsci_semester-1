import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_12p2
{
	public static String[]words;
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("*FIND Z*");
		
		words = new String[5];
		fillArray();
		System.out.print("For the words ");
		printArray();
		hasZs();
		System.out.print( hasZs() + " contains (Z)");
		
	}

	public static void fillArray()
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input 5 words:  ");
		for(int i= 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for(String word: words)
		{
			System.out.print(word + "");
				System.out.print(word + "");
		}
	}

	public static String hasZs()
	{
		String zs = "";
		for(String word: words)
		{
			if (word.indexOf("z") >=0)
			{
				zs = zs + word + ",";
			}
		}
		return zs;
	}
	
}

