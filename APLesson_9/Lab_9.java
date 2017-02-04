import java.util.Scanner;
public class Lab_9
{
	

	//rework later*done*
	public static void main(String[]args)
	{
		String[] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Input 5 words:");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("\nFoward:");
		for(String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println("\nReversed:");
		Reverse(words);
	}
	public static void Reverse(String[] a)
	{
		for(int i = a.length-1; i >= 0; i--){
			System.out.println(a[i]);
		}
	}
}