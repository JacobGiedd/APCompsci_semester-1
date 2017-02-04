import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab_12p2runner 
{
	

   public static void main(String[]args)
   {
	   //scanner
	Scanner kb = new Scanner(System.in);
	
	//INPUTS #1
	System.out.println(" xOne value");
		int x1 = kb.nextInt();
	
	System.out.println(" yOne value");
		int y1 = kb.nextInt();
	
	System.out.println(" xTwo value");
		int x2 = kb.nextInt();
	
	System.out.println(" yTwo value");
		int y2 = kb.nextInt();

	Distance object = new Distance(x1, y1, x2, y2);
	//INPUTS #2
			System.out.println("The distance between the points (" + x1 + ", " + y1 + ") & (" + x2 + ", " + y2 + ") is " + object.getDist());
	
	System.out.println(" xOne value");
		x1 = kb.nextInt();
	
	System.out.println(" yOne value");
		y1 = kb.nextInt();
	
	System.out.println(" xTwo value");
		x2 = kb.nextInt();
	
	System.out.println(" yTwo value");
		y2 = kb.nextInt();
	
	object.setValues(x1, y1, x2, y2);
	
			System.out.println("The distance between the points (" + x1 + ", " + y1 + ") &   (" + x2 + ", " + y2 + ") is " + object.getDist());
   }
}