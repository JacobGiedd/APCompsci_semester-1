public class Lab_02
{
	public static void main(String[]args)
	{
		System.out.println("Objective_One");
		System.out.println();
		int num1 = 9;
		int num2 = 8;
		
		System.out.println("num1 multipied by num 2 is " + num1 * num2);
		System.out.println();
		
		System.out.println("Objective_Two");
		System.out.println();
		
		String first = "Bill Smith";
		String second = "1122 Wonton Street";
		String third = "SoupCity, MD ";
		int forth = 63824;
		System.out.println( first );
		System.out.println( second );
		System.out.println( third + forth);
		System.out.println();
		
		System.out.println("Objective_Three");
		System.out.println();
		
		int l = 8;
		
		int w = 5;
		int h = 4;
		int t = 2;
		int recArea =  (2 * w * l ) + (2 * l * h) + (2 * h * w * l) ;
		
		System.out.println("the surface area of the rectangular cube is" +" "+ recArea);
	}
}