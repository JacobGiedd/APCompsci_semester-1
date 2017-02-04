import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
import java.lang.Math.*;
public class Lab_12
{
	//objectz
 static int distance;
 static int hours;
 
 static int minutes;
 static double mph;
		
		//inputs
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int dis, int hrs, int min)
	{
		distance = dist;
		hours =hrs;
		minutes = min;
		mph = 0;
	}
		//memes
	public void setMinutes(int min)
	{
		minutes = min;
	}
	public void setHours(int hrs)
	{
		hours = hrs;
	}
	public void setDistance(int dis)
	{
		distance = dis;
	}
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
		
	}
}