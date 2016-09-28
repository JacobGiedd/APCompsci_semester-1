public class Lab_02
{
	public static void main(String[]args)
	{
		System.out.println("Objective_One");
		int num1 = 9;
		int num2 = 8;
		
		System.out.println("num1 multipied by num 2 is " + num1 * num2);
		
		System.out.println("Objective_Two");
		
		String first = "Bill Smith";
		String second = "Wonton Street";
		String third = "SoupCity";
		int forth = 1122;
		System.out.println( first +" " + second);
		System.out.println( third + forth);
		
		System.out.println("Objective_Three");
		
		int l = 8;
		
		int w = 5;
		int h = 4;
		int t = 2;
		int recArea =  (2 * w * l ) + (2 * l * h) + (2 * h * w * l) ;
		
		System.out.println("the surface area of the rectangular cube is" +" "+ recArea);
	}
}