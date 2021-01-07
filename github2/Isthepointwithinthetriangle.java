package github2;
import java.util.Scanner;
public class Isthepointwithinthetriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x- and y-coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(x < 0 || y < 0)
			System.out.println("The point is not in the triangle.");
		else{
			if(x >(200 - 2*y ))
				System.out.println("The point is not in the triangle.");
			else
				System.out.println("The point is in the triangle.");
		}
	}
}
