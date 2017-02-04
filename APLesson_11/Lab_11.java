import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_11
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("*RANDOM NUMBERS*");
		
		int[][]nums = new int [4][4];
		
		int num = 1;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length;j++)
			{
				nums[i][j] = 1 + (int)(Math.random() * 99999);
			}
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}