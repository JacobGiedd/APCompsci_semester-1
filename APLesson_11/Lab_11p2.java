import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_11p2
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		
		String[][]words = new String [4][4];
		Scanner kb = new Scanner(System.in);
		int num = 1;
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length;j++)
			{
				System.out.println("Please enter a word");
				words[i][j]= kb.next();
			}
		}
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
}