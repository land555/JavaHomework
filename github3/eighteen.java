package github3;
import java.util.Scanner;
public class eighteen {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("请输入十个数：");
	    double[] nums = new double[10];
	    for (int i = 0; i < 10; i++) {
	        nums[i] = input.nextDouble();
	    }
	for(int i = 0; i < 9; ++i){
		for(int j = 0; j < 9; ++j){
			if(nums[j] < nums[j+1]){
				double temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
	}
	for(int i = 0; i < 9; ++i){
		System.out.println(nums[i]);
			}
		}
	}
