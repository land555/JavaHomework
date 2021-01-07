package github2;
import java.util.Scanner;
public class PickACard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] size = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] flowerColor = {"Clubs","Diamonds","Hearts","Spades"};
		System.out.println("The card you picked is " + size[(int)(Math.random()*13)] +
				" of " + flowerColor[(int)(Math.random()*4)]);
	}
}
