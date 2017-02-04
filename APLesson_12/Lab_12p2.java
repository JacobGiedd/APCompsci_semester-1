import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
import java.lang.Math.*;
public class Lab_12p2
{
    static int xOne, yOne;
	static int xTwo, yTwo;
	
   static double distance;
   //7PS
public Distance(int x1, int y1, int x2, int y2)
{
	xOne = x1;
		yOne = y1;
	xTwo = x2;
		yTwo = x2;
	distance = 0;
  }
	//7possibly swicth
public Distance()
{
	  xOne = 0;
		yOne = 0;
	  xTwo = 0;
		yTwo = 0;
	  distance = 0;
  }

public void setValues(int x1, int y1, int x2, int y2)
{
	  
	xOne = x1;
		yOne = y1;
	xTwo = x2;
		yTwo = x2;
  }
  
public double getDist()
{
	  distance =  Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
	  
	  return distance;
	}

}