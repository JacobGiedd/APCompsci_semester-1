import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_11p3
{
	
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		String[][]xAnd0 = new String [4][4];
		int num = 1;
		for(int i = 0; i < xAnd0.length; i++)
		{
			for(int j = 0; j < xAnd0[i].length;j++)
			{
				int pick = 1 + (int)(Math.random() * 2);
				if(pick == 1)
					xAnd0[i][j] = "x";
				else
					xAnd0[i][j] = "o";
				System.out.print(xAnd0[i][j] + "\t");
			}
				System.out.println("");
		}
		
		
	}
}