package github3;
import java.util.Scanner;
public class Thirtyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		str = sort(str);
		System.out.println(str);
	}
 
	public static String sort(String s){
		char[] chs = s.toCharArray();
		java.util.Arrays.sort(chs);
		String result = String.valueOf(chs);
		return result;

	}

}
