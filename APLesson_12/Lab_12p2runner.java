import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab_12p2runner {
	
    public static void main(String[] args) 
	{
		
        int x1,x2,y1,y2;
        double distance;
		
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*INPUT x1, x2, y1, y2 CORDNATES*");
		
        x1 = keyboard.nextInt();
        x2 = keyboard.nextInt();
        y1 = keyboard.nextInt();
        y2 = keyboard.nextInt();

        Distance object = new Distance(x1, x2, y1, y2);
        object.calcDistance();
        System.out.println("DISTANCE = "+object.getDistance());

    }
}