import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_11p5
{
	Scanner kb;
	public static void main(String[]agrs)
	{
		
		static int bulletCount;
		static int CLIPSIZE = 16;
		static int shotCount;
		static String[]clip;
	}
	Scanner kb = new Scanner(System.in);
	bulletCount = 96;
	shotCount = 0;
	clip = new String [CLIPSIZE];
	resetClip();
	
	while(bulletCount>0 || shotCount>0)
	{
		System.out.println("Beging");
		String action = kb.next().toLowerCase();
		
		if(action.equals("r"))
			reload();
		else if(action.equals("s"))
			shoot();
		
		printClip();
	}
}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++){
			clip[i] = (i < shotCount) ? "[ ]" : "*  ";
		}
	}
	
	public static String shoot()
	{
		if(shotCount > 0){
			clip[shotCount-1] = "*";
			shotCount--;
			return "LE SHOT!";}
		else{
			return "RELOAD!";}
	}
	
	public static void reload()
	{
		int orig = shotCount;
		
		shotCount = Math.min(CLIPSIZE, bulletCount);
		bulletCount -= shotCount - orig;
		
		resetClip();
	}
	
	public static void printClip()
	{
		String output = "";
		output += "Bullets \t" + bulletCount + "\nClips \t";
		for(int i = 0; i < clip.length;i++)
			output += clip[i];
		
		System.out.println(output);
	}
}