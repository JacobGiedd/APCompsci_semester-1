import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math.*;
public class Lab_12p4
{
	
    private String height, weight, hairColor, eyeColor;

    public Human(String a, String b, String c, String d)
	{
        height=a;weight=b;hairColor=c;eyeColor=d;}

		public String getHeight(){return height;}
		public String getWeight(){return weight;}
		public String getHairColor(){return hairColor;}
		public String getEyeColor(){return eyeColor;}
	
    public static void main(String[]args){
        System.out.println("*INPUT HEIGHT, WEIGHT, HAIR, EYE*");
        Scanner in = new Scanner(System.in);
        Human dude = new Human(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
        System.out.println("FINNAL HUMAN: \n"+dude.getHeight()+", "+dude.getWeight()+", "+dude.getHairColor()+", "+dude.getEyeColor());
    }


}