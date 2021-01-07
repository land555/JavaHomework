package github3;
import java.util.Scanner;
import java.util.Arrays;
public class five {
	public static void main(String[] args) {
	
		int[] nums = new int[100];
		System.out.print("Enter ten numbers:");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; ++i){
			int n = input.nextInt();
			++nums[n];
		}
		
		System.out.print("The number of distinct number is ");
		int count = 0;
		for(int i = 0; i < 100; ++i)
			if(nums[i] != 0)
				++count;
		System.out.println(count);
		
	    System.out.print("The distinct numbers are : ");
		for(int i = 0; i < 100; ++i){
			if(nums[i] != 0)
				System.out.print(i + " ");
		}
	}
}
