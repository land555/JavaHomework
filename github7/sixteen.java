package github7;
import java.util.ArrayList;
import java.util.Scanner;
 
public class sixteen {
 
	public static void main(String[] args) {
		int n1=(int) (Math.random()*10);
		int n2=(int) (Math.random()*10);
		
		ArrayList<Integer> list=new ArrayList<>();
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is "+n1+" + "+n2+"?");  
		
		int answer=input.nextInt();
		
		while(n1+n2!=answer) {
			if( !list.contains(answer) ) {
				list.add(answer);
			}
			else {
				System.out.println("You already entered "+answer);
			}
			
			
			System.out.print("Wrong answer.Try again.What is "
					+ n1+" + "+n2+"? ");
			answer=input.nextInt();
		}
		
		System.out.println("You got it!");
 
	}
 
}
 