package github3;
import java.util.Scanner;
import java.util.Arrays;
public class nineteen {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n;
	    System.out.println("Enter list:");
	    n = input.nextInt();
	    int[] nums = new int[n];
	    for (int i = 0; i < n; i++) {
	        nums[i] = input.nextInt();
	    }
	    for(int i = 1; i < n; ++i){
			if(nums[i] < nums[i-1]){
				System.out.println("The list is not sorted");
				return ;
			}
		}
		System.out.println("The list is already sorted");
	}	
}

