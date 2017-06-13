import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ToyStoreRunner

{
	//Runs the Toy Store Class
	public static void main(String[]args)
	{
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store);
		
		
		System.out.println("Most Frequent Toy: " + store.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + store.getMostFrequentType());
	}
}