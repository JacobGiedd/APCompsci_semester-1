import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlayStation extends Console
{
	public PlayStation()
	{
		super();
	}
	
	public PlayStation(String p)
	{
		super(p);
	}
	
	
	public String getController()
	{
		return "Ps DualShock ";
	}	
	public String getPlatform()
	{
		return "PlayStation";
	}
	
}