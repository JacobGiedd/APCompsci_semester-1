import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
import java.lang.Math.*;

public class Lab_12runner
{
	public static void main(String[]args)
	{
		//INPUTS #1
	Scanner kb = new Scanner(System.in);
	
	System.out.println("What is the total distance");
		int distance = kb.nextInt();
		
	System.out.println("What is the total hours");
		int hours = kb.nextInt();
		
	System.out.println("What is the total minutes?");
		int minutes = kb.nextInt();

	MilesPerHour object = new MilesPerHour(distance, hours, minutes);
	//INPUTS #2
	System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes " + "= " + object.getMPH());
	
	System.out.println("What is the total distance");
		distance = kb.nextInt();
		
	System.out.println("What is the total hours");
		hours = kb.nextInt();
		
	System.out.println("What is the total minutes");
		minutes = kb.nextInt();
	//set objects
	object.setDistance(distance);
	object.setHours(hours);
	object.setMinutes(minutes);
	
	System.out.println(distance + "Miles in " + hours + " Hours and" + minutes + " Minutes " + "= " +   object.getMPH());
	
	}
	
}