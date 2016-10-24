import java.util.Scanner; 

public class Lab_5p3
{
	static double gradePoints;
	static double GPA;
	static double gPoints;
	
	public static void main(String[]args)
	{	//function
		System.out.println("*GPA Calculator*");
		
		//scanners 
		Lab_5p3 form = new Lab_5p3();
		Scanner keyboard = new Scanner(System.in);
		
		//user imputs
		System.out.println("please enter your 1st grade");
			String gone = keyboard.next();
			
		System.out.println("please enter your 2nd grade");
			String gtwo = keyboard.next();
			
		System.out.println("please enter your 3rd grade");
			String gthree = keyboard.next();
			
		System.out.println("please enter your 4th grade");
			String gfour = keyboard.next();
			
		System.out.println("please enter your 5th grade");
			String gfive = keyboard.next();
			
		System.out.println("please enter your 6th grade");
			String gsix = keyboard.next();
			
		System.out.println("please enter your 7th grade");
			String gseven = keyboard.next();
		
		double gradePoints = calcPoints(gone) + calcPoints(gtwo) + calcPoints(gthree) + calcPoints(gfour) + calcPoints(gfive) + calcPoints(gsix) + calcPoints(gseven);
		
		double GPA = gradePoints / 7;
		
		System.out.println("your GPA is " + GPA);
		
	}
	
	public static double calcPoints(String grade)
	{
		gradePoints = 0;
		if (grade.equals("A"))
			gradePoints = 4.0;
		
		if (grade.equals("B"))
			gradePoints = 3.0;
		
		if (grade.equals("C"))
			gradePoints = 2.0;
		
		if (grade.equals("D"))
			gradePoints = 1.0;
		
		if (grade.equals("F"))
			gradePoints = 0.0;
		
		return gradePoints;
	}
}