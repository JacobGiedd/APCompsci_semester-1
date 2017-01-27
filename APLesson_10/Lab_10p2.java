import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_10p2
{
	
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("*EXPRESSION SOLVER*");
Scanner input = new Scanner(System.in);
		System.out.println("Input equationn");
		String expression = input.nextLine();
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));

		doEquation(equation);
	}
	
	public static void doEquation(ArrayList<String> equation)
	{	
		int i = 0;
		while(i < equation.size())
		{
			if(i < equation.size() && equation.get(i).equals("/"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if(i < equation.size() && equation.get(i).equals("*"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}
		i = 0;
		while(i < equation.size())
		{
			if(i < equation.size() && equation.get(i).equals("+"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if(i < equation.size() && equation.get(i).equals("-"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}
		
		System.out.println(equation);
	}
}