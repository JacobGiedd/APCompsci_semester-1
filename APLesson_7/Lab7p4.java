import java.util.Scanner;
public class Lab_7p4
{
	static String sentence;
	public static void main(String[]args)
	{	
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Input A Sentence");
		sentence= kb.nextLine();
		replace();
		System.out.println("Your @ Swaped sentance is: " + sentence);
		
	}
	
	public static void replace()
	{
		while(sentence.indexOf("a") >=0)
			{
				sentence = sentence.substring(0, sentence.indexOf("a")) +"@" + sentence.substring(sentence.indexOf("a") + 1);
			}
	}
}