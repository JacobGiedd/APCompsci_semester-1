import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Rectangle implements cutShapes
{
	double sideA, sideB;
	public Rectangle()
	{
		sideA = sideB = 0;
	}
	public Rectangle(double a, double b)
	{
		sideA = a;
		sideB = b;
	}
	public double getSideA()
	{
		return sideA;
	}
	public double getSideB()
	{
		return sideB;
	}
	public double getArea()
	{
		return sideA * sideB;
	}
}


{
}