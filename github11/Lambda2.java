package github11;

public class Lambda2 {
	 final static String salutation = "Hello! ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   GreetingService greetService1 = message -> 
		      System.out.println(salutation + message);
		      greetService1.sayMessage("Runoob");
		   }
		    
		   interface GreetingService {
		      void sayMessage(String message);
	}

}
