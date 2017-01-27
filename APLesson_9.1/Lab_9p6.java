import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_9p6
{
	Scanner kb;
	public static int[]numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		printArray();
		System.out.print("\nThe biggest number is" + getBiggest());
		
	}
	
	public static void fillArray()
	{
		for(int i= 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*200)+1;
		}
	}
	public static void printArray()
	{
		for(int number: numbers)
		{
			System.out.print(number + " ");
		}
	}
	
	public static int getBiggest()
	{
		int max =0;
		
		for(int number: numbers)
		{
			
			if (number >= max){
				max = number;
			}
		}
		
		return max;
	}

}