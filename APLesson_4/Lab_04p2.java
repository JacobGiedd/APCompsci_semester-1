import java.util.Scanner;

public class Lab_04p2
{
	
	//ID MAKER
	public static void main(String[]args)
	{
		Lab_04p2 form = new Lab_04p2();
		Scanner keyboard = new Scanner(System.in);
		
	System.out.println("FUNCTION_#2");	
	System.out.println("*ID Maker*");
	
	 //Imput#1
		System.out.println("Please enter your frst name");
		String fname = keyboard.next();
	 //Imput#2
		System.out.println("Please enter your last name");
		String lname = keyboard.next();
	 //Imput#3
		System.out.println("Please enter your title");
		String title = keyboard.next();
		keyboard.nextLine();
 	 //Imput#4
		System.out.println("Please enter your school site");
		String site = keyboard.nextLine();
	 //Imput#5
		System.out.println("Please enter your school year");
		String year = keyboard.nextLine();
 	 //Imput#6
		System.out.println("Please enter your subject");
		String sub = keyboard.next();
			
		//Print Statemets
		System.out.println("\n***********************************");
		form.format(site, year);
		form.format(fname, lname);
		form.format(title, sub);
		
		System.out.println("***********************************");
		
	}
	
	public void format(String word, String number)
	{
		System.out.printf("* %10s  %30.2s *\n", word, number);
	}
}