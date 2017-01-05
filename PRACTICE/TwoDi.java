import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class TwoDi
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		//Array
		int[][]values = new int [4][4];
		
		int num = 1;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; i <values[i].length; j++)
			{
				values[i][j] = num;
				num++;
			}
		}
		
		//Print
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; i < values[i].length; j++)
			{
				System.out.print(values[i][j]; + "\t");
			}
			System.out.println();
		}
	}
}