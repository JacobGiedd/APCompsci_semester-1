import java.util.Scanner; 

public class Lab_5p4
{
	static String condition;
	static int BMI;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("-BMI Calculator-");
		
		System.out.println("-Imput Hight-");
		System.out.println("(inches)");
		
		int h = keyboard.nextInt();
		
		System.out.println("-Imput wieght-");
		System.out.println("(pounds)");
		
		int w = keyboard.nextInt();
		
		double hh = h * h;
		int ww = w * 703;
		
		System.out.println(" Your BMI is "); 
		System.out.println(ww / hh);
		System.out.println("You are " + condition);
		double BMI = ww / hh;
	}
	
	public static void calcCondish()
	{
		if ( BMI < 18.5)
			condition = "-Underweight-";
		if ( 18.5 < BMI < 24.9)
			condition = "-Normal-";
		if ( 25 < BMI < 29.9)
			condition = "-Overweight-";
		if ( 30 < BMI < 34.9)
			condition = "-Obese-";
		if ( 35 < BMI < 39.9)
			condition = "-VeryObese-";
		if ( 40 < BMI)
			condition = "-Morbidly Obese-";
		
		return ;
	}
}
 