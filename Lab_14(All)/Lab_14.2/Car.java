import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Car implements Location
{
	public int ID;
	public Car()
	{
	
		ID = (int)(Math.random()*999999) + 1x;
	}
	
	public abstract void move(double xm, double ym);
}