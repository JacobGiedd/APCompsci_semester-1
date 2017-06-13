import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PC extends GameSystems
{
	public PC()
	{
		super();
	}
	
	
	public PC(String p)
	{
		super(p);
	}
	
	public String SystemInput()
	{
		return "Keyboard & Mouse";
	}
	
	public String toString()
	
	
	{
		
		return "Platform: " + super.getPlatform() +
		       "\nSerial #: " + super.getSerialNo() +
			   "\nController: " + SystemInput();
	}
}
