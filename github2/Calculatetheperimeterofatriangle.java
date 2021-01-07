package github2;

import java.util.Scanner;

public class Calculatetheperimeterofatriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three sides:");
		int side1=input.nextInt();
		int side2=input.nextInt();
		int side3=input.nextInt();
		if((side1+side2>side3)&&(side3+side1>side2)&&(side3+side2>side1))
		System.out.println("The circle is"+(side1+side2+side3));
		else
			System.out.println("The side is not legal");
	}
	

}
