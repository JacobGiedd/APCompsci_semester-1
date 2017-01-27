import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
import java.lang.Math.*;
public class Lab_12p2
{
    private int xOne, xTwo,yOne, yTwo;
	
    private double distance;
   
    public Distance(int x1, int x2, int y1, int y2)
	{
        xOne=x1;
        xTwo=x2;
        yOne=y1;
        yTwo=y2;
        distance=0;
    }

    public void resetPoints()
	{
        xOne=0;
        xTwo=0;
        yOne=0;
        yTwo=0;
        distance=0;
    }

    public void calcDistance() 
	{
        distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
    }

    public double getDistance()
	{
        return distance;
    }
}
