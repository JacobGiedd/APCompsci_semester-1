import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math.*;
public class Lab_12p3
{
    private String color, engine, interior, wheels;
    public Car(String a,String b, String c, String d)
	{
        color=a;
        engine=b;
        interior=c;
        wheels=d;
    }
	
    public void setValues(String a, String b, String c, String d)
	{
        color=a;
        engine=b;
        interior=c;
        wheels=d;
    }
	
    public String getColor()
	{
        return color;
    }
    public String getEngine()
	{
        return engine;
    }
    public String getInterior()
	{
        return interior;
    }
    public String getWheels()
	{
        return wheels;
    }
	
    public static void main(String[]vars)
	{
        Scanner lol = new Scanner(System.in);
        System.out.println("*IMPUT COLOR, ENGINE, INTERIOR, WHEELS*");
        Car nice = new Car(lol.nextLine(),lol.nextLine(),lol.nextLine(),lol.nextLine());
        System.out.println("-FINNAL CAR-"+nice.getColor()+", "+nice.getEngine()+", "+nice.getInterior()+","+nice.getWheels());

    }
}