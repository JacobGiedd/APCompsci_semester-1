import java.util.Scanner;
public class Lab_5p5
{
	static Scanner kb;
	public static void main(String[]agrs)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("-Welcome To the Adventure-");
		System.out.println("-Dogsader & The Quest For The Holy Biscut-");
		System.out.println("*PROLAUGE*-You are a half dog half human crusader on a quest to retake the holy land of biscuts from the evil leauge of cats occuping the city");
		System.out.println("you start our quest at the doghuman castle, BUT BY THE DOGHUMAN POPE YOU'VE OVERSLEEPED! will you (A)-eat breakfast before leaving or will you (B)-leave to join the fight now to make it on time?");
		String choice = kb.next();
		if(choice.equals("A"))
		{
				System.out.println("You take your time to eat a delecious plate of eggs and bacon and feel well prepared you take your swoed and head for battle, BUT THE BATTLE HAS COME TO YOU!. will you (C)-Join the mob and fight or will you (D)-sneek around to the Holy land");
			if(choice.equals("C"))
				System.out.println("You join the mob and fight with grace but are met with a massive sige tower! will you (E)-attack the sige tower or will you (F)-run like a doghuman coward?");
				if(choice.equals("E"))
					System.out.println("You take on the leviathan! it charges forth and crushes you... your story has ended");
				else
					System.out.println("your comrads see you run away, they shout in anger but its too late and they fall victem to the tower.");
					System.out.println("you journy south to escape for a better life as all is lost for the holy biscuts... your story has ended");
			else
					System.out.println("You try and sneek around the battle, BUT YOU'VE BEEN DISCOVERED! will you (G)-run back to the castle or will you (H)- attack the enemy captin?");
				if(choice.equals("G"))
					System.out.println("you run back to the castle and slam the gate shut, but its far too late run!");
					System.out.println(" A seige tower emerges from the fog of war and quickly lays waste to the fort with you inside... your story has ended");
				else
					System.out.println("you observe closely and make your move. The enemy is swift but you are swifter! you quickly charge their captin and plunge a sword into his apendex");
					System.out.println("just as you think you may have one this your body begins to ache and your muscles volently atrafiy into bones!");
					System.out.println("breakfast was the most important meal of the day and you skiped it... and you shall also suffer");
					System.out.println("in your last moments you see the tide of battle turn as your brothers take controll... this is your end but there is still hope for the crusaide");
		}
		else
			System.out.println("You rush out of the castle swiftly and charge forth to the battle, BUT YOU'VE FORGOTEN YOUR SWORD! will you (G)-pick up an awfully point stick or will you (H)-charge in wiht your mighty doghuman paw-hands");
		
			if(choice.equals(""))
				System.out.println("");
			else
				System.out.println("");
			
	}
}