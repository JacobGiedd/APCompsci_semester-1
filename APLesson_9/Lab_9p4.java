import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab_9p4
{
	static int start;
	static int size;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Starting numbers: ");
		start = kb.nextInt();
		
		System.out.println("Sequence size: ");
		size = kb.nextInt();
		int[] seq = new int[size];
		
		for(int i= 0; i < size; i++)
		{
			if (i==0 || i==1)
			{
				seq[i]= start;
			}
			
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.print(seq[i] + " ");

		}			
		
	}
	
}

