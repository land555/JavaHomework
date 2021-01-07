package github2;
import java.util.Scanner;
import java.lang.Math;
public class TwoRectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
	    double x1 = input.nextDouble();
	    double y1 = input.nextDouble();
	    double w1 = input.nextDouble();
	    double h1 = input.nextDouble();

	    System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
	    double x2 = input.nextDouble();
	    double y2 = input.nextDouble();
	    double w2 = input.nextDouble();
	    double h2 = input.nextDouble();

	    double xDistance = Math.abs(x1-x2);
	    double yDistance = Math.abs(y1-y2);
	   
	    if (xDistance <= (w1 - w2) / 2 && yDistance <= (h1 - h2) / 2)
	        System.out.println("r2 is inside r1");
	    else if (xDistance <= (w1 + w2) / 2 && yDistance <= (h1 + h2) / 2)
	        System.out.println("r2 overlaps r1");
	    else
	        System.out.println("r2 does not overlap r1");

	}
}
