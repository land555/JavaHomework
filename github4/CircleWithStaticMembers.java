package github4;

public class CircleWithStaticMembers {
	double rasdius;
	static int numberOfobjects=0;
	CircleWithStaticMembers(){
		radius=1;
		numberOfObjects++;
		
	}
	CircleWithStaticMembers(double newRadius){
		radius=newRadius;
		numberOfObjects++;
		
	}

	static int getNumberOfbjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
}
