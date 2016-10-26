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
		System.out.println("-Please Enter Username-");
		string un = kb.next();
		if(un.equals("Soup"))
		{
			System.out.println("-Please Enter Password-");
			string pw = kb.next();
			if(pw.equals("123"))
				System.out.println("-ACCESS GRANTED-");
			else
				System.out.println("-Incorect-");
				System.out.println("-Please Enter Password-");
				recursion();
		}		
		else
			System.out.println("-Incorect-");
			System.out.println("-Please Enter Username-");
			recursion();
	}
}