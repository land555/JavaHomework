package github2;

import java.util.Scanner;

public class lotteryticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int lottery = (int)(Math.random()*1000);
		System.out.println("Enter your lottery pick(three digit)");
		int guess = input.nextInt();
		int lottery1 = lottery/100;
		int lottery2 = lottery%10;
		int lottery3 = (lottery%100)/10;
		
		int guess1 = guess/100;
		int guess2 = guess%10;
		int guess3 = (guess%100)/10;
		
		if(guess == lottery)
			System.out.println("Exact macth:you win $10000");
		else if((lottery1 == guess2 && lottery2 == guess1 && lottery3 == guess3)||
				(lottery1 == guess3 && lottery3 == guess1 && lottery2 == guess2)||
				(lottery1 == guess1 && lottery2 == guess3 && lottery3 == guess2))
			System.out.println("Match all digits:you win $3000");
		else if(guess1 == lottery1 || guess1 == lottery2 || guess1 == lottery3 ||
				guess2 == lottery1 || guess2 == lottery2 || guess2 == lottery3 ||
				guess3 == lottery1 || guess3 == lottery2 || guess3 == lottery3 )
			System.out.println("Match one digit:you win $1000");
		else
			System.out.println("Sorry,you are wrong!");
	}
}

