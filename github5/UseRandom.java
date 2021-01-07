package github5;
import java.util.Scanner;
import java.util.Random;
public class UseRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Random random = new Random(1000);
				for(int i = 0; i < 50; ++i){
					System.out.print(random.nextInt(100) + " ");
					if(i%10 == 0)
						System.out.println();
			
		}

	}

}
