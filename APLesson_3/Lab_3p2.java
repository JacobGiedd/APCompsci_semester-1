import java.util.Scanner; 

public class Lab_3p2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("-BMI Calculator-");
		
		System.out.println("-Imput Hight-");
		
		double h = keyboard.nextInt();
		
		System.out.println("-Imput wieght-");
		
		double w = keyboard.nextInt();
		
		System.out.println(" Your BMI is"); 
		System.out.println("	" + w / h * h * 703);
	}
	
}
