package github4;

public class SimpleCircle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCircle1 circle1=new SimpleCircle1 ();
		  System.out.println("circle of radius"+circle1.radius+"is"+circle1.getArea());
		  
		  SimpleCircle1 circle2=new SimpleCircle1(25);
		  System.out.println("The area of the circle of radius"+circle2.radius+"is"+circle2.getArea());
		  
		  SimpleCircle1 circle3=new SimpleCircle1(125);
		  System.out.println("The area of the circle of radius"+circle3.radius+"is"+circle3.getArea());
		  
		  circle2.radius=100;
	      System.out.println("The area of the circle of radius"+circle2.radius+"is"+circle2.getArea());
	      }
	double radius;
	SimpleCircle1(){
		radius=1;
	}
	SimpleCircle1(double newRadius){
		radius=newRadius;
	}
	double getArea() {
		return radius*radius*Math.PI;
		
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	void setRadius(double newRadius) {
		radius=newRadius;
	}

}