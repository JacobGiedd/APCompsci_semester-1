import java.util.Scanner;
public class Lab_8
{
	static String sentence;
	static String word1;
	static String word2;
	static String word3;
	
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input Word1");
		String word1 =kb.next();		
		System.out.println("Input Word2");
		String word2 =kb.next();		
		System.out.println("Input Word3");
		String word3 =kb.next();		
		
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String word)
	{
		if (word.length()>=20)
		{
			return word;
		}
		else
		{
			word = ("  " + word + "  ");
			return makeCenter(word);
		}
	}
}