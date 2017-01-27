import java.util.Scanner;
public class Lab_6p8
{
	
	Scanner kb;
	public static void main(String[]args)
	{
		repeat("NA",4);
		repeat("NA",4);
		repeat("HEY",3);
		repeat("GOODBYE!",1);
	}
	public static void repeat(String Word,int times)
	{
	for(int i = 1; i <= times; i++)
		{
			System.out.print(Word+ " ");
		}
	}
} 