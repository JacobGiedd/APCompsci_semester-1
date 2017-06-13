import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Advance extends Ticket
{

	private int daysLeft;
	
	
	public Advance()
	{
		super();
	}
	
	public Advance(int d)
	{
		super();
	}
	
	public int getPrice()
	{
		if(daysLeft >= 10)
		{
			return 30;
		}
		else
		{
		
		
			return 40;
		}
	}
	
}
