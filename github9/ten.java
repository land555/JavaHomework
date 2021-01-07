package github9;
import java.util.ArrayList;
public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Double> h = new ArrayList<Double>();
	        double i = 114514;
	        while(true){
	            i++;
	            try{
	                h.add(i);
	            }
	            catch(OutOfMemoryError killerQueen){
	                System.out.print("Ohhhhhh!");
	                System.exit(1);
	            }
	        }
	    }
	}


