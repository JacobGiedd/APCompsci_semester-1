import java.util.Scanner;

import java.util.Arrays;
public class Lab_11p4
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		
		Scanner kb = new Scanner(System.in);
		int[][]nums = new int [4][4];
		
		int num = 1;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length;j++)
			{
				nums[i][j] = 1 + (int)(Math.random() * 100);
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Enter a Value");
		int divisor = kb.nextInt();
		
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length;j++)
			{
			if(nums[i][j]%divisor == 0)
				count++;
			else
				count=count;
			}
		}
		System.out.println( count + " Numbers are divisible by " + divisor);
	}
	
	
}