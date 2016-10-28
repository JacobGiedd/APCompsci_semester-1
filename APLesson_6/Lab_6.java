import java.util.Scanner;
public class Lab_6
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		recursion();
	}
	
	public static void recursion()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("-Please Enter Username-");
		String un = kb.next();
		if(un.equals("peeyoi"))
		{
			System.out.println("-Please Enter Password-");
			String pw = kb.next();
			if(pw.equals("1738"))
				System.out.println("-ACCESS GRANTED-");
			else
			{
				System.out.println("-Your password is Incorect-");
				recursion();
			}
		}		
		else
		{
			System.out.println("-Your ussername is Incorect-");
			recursion();
		}
	}
}