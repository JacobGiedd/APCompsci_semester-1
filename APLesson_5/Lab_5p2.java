import java.util.Scanner;

public class Lab_5p2
{
	public static void main(String[]args)
	{
		
		Lab_5p2 form = new Lab_5p2();
		Scanner keyboard = new Scanner(System.in);
		//START LAB-5.2
				System.out.println();
		System.out.println("*DiscountReceiptMaker*");
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

		//User imput# 4
		System.out.println("\nPlease enter item #4");
		String four = keyboard.next();
		System.out.println("please enter the price");
			double pfour = keyboard.nextInt();
		
		String word4 = four;
		double number4 = pfour;
		
		//Receipt
		System.out.println("\n<<<<<<<<<__Receipt__>>>>>>>>>");
			form.format(word1, number1);
			form.format(word2, number2);
			form.format(word3, number3);
			form.format(word4, number4);
				System.out.println();
				System.out.println(); 
			
		//Totals
		double subtotal = number1 + number2 + number3 + number4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 1 / 10;
		double total = discount + tax;
		
		//Receipt
			form.format("Subtotal", subtotal);
		form.format("Tax", tax);
		form.format("Total", total);
		System.out.println("_______________________________");
	}
		//Discount & If statement 
		public static double calcDisc(double subtotal)
		{
			if(subtotal > 2000)
				return subtotal * 0.15;
			return 0.0;
		}
		
	
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
	
}