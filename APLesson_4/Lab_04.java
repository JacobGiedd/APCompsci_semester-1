import java.util.Scanner;

public class Lab_04
{
	public static void main(String[]args)
	{
		
		Lab_04 form = new Lab_04();
		Scanner keyboard = new Scanner(System.in);
		//START LAB-04
		System.out.println("FUNCTION_#1");
				System.out.println("							   ");
				
		
		System.out.println("*ReceiptMaker*");
		//User imput# 1
		System.out.println("Please enter item #1");
			String one = keyboard.next();
				System.out.println("please enter the price");
					double pone = keyboard.nextInt();
		
		String word1 = one;		
		double number1 =  pone;
		
		//User imput# 2
		System.out.println("\nPlease enter item #2");
			String two = keyboard.next();
				System.out.println("please enter the price");
					double ptwo = keyboard.nextInt();
		
		String word2 = two;
		double number2 = ptwo;
		
		//User imput# 3
		System.out.println("\nPlease enter item #3");
			String three = keyboard.next();
				System.out.println("please enter the price");
					double pthree = keyboard.nextInt();
		
		String word3 = three;
		double number3 = pthree;
		//Receipt
		System.out.println("\n<<<<<<<<<__Receipt__>>>>>>>>>");
			form.format(word1, number1);
			form.format(word2, number2);
			form.format(word3, number3);
				System.out.println(" ");
				System.out.println(" "); 
			
		//Totals
		double subtotal = number1 + number2 + number3;
		double tax = subtotal * 1 / 10;
		double total = subtotal + tax;
		
		form.format("Subtotal", subtotal);
		form.format("Tax", tax);
		form.format("Total", total);
		System.out.println("");
		System.out.println("____________________________________");
		
		
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
	
}