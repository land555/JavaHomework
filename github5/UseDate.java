package github5;
import java.util.Scanner;
import java.util.Date;
public class UseDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				long n = 10000;
				Date date = new Date(n);
				System.out.println(date.toString());
				
				date.setTime(n*10);
				System.out.println(date.toString());
				
				date.setTime(n*100);
				System.out.println(date.toString());
				
				date.setTime(n*1000);
				System.out.println(date.toString());
				
				date.setTime(n*n);
				System.out.println(date.toString());
				
				date.setTime(n*n*10);
				System.out.println(date.toString());
				
				date.setTime(n*n*100);
				System.out.println(date.toString());
				
				date.setTime(n*n*1000);
				System.out.println(date.toString());

	}

}
