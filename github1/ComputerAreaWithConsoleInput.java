package github1;

import java.util.Scanner;

public class ComputerAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
		
		//prompt the user to enter a radius
		System.out.print("Enter a number for radius;");
		double radius=input.nextDouble();
		
		//computer area
		double area=radius*radius*3.14159;
		
		//Display results
		System.out.println("The area for the circle of radius"+radius+"is"+area);
	}

}
