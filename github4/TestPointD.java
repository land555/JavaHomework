package github4;
import java.util.Scanner;
import javafx.geometry.point2D;
public class TestPointD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter point1's x-,y-condinates:");
		double x1=input.nextDOuble();
		double y1=input.nextDOuble();
		System.out.println("Enter point2's x-,y-condinates:");
		double x2=input.nextDOuble();
		double y2=input.nextDOuble();
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		System.out.println("p1 is"+p1.toString());
		System.out.println("p2 is"+p2.toString());
		System.out.println("The distance between p1 and p2 is"+p1.distance(p2));
		
	}

}
