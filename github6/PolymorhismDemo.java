package github6;

public class PolymorhismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
	        displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
	    }
	    public static void displayObject(SimpleGeometricObject object){
	        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
	}

}
