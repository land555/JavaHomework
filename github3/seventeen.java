package github3;
import java.util.Scanner;
import java.util.Arrays;
public class seventeen {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	 
	    int n;
	    System.out.print("请输入学生的个数：");
	    n = input.nextInt();
	 
	    String[] names = new String[n];
	    double[] grades = new double[n];
	    for (int i = 0; i < n; i++) {
	        System.out.print("请输入第" + (i + 1) + "学生的姓名：");
	        names[i] = input.next();
	        System.out.print("请输入第" + (i + 1) + "学生的成绩：");
	       grades[i] = input.nextDouble();
	    }
	 
	 
	
	for(int i = 0; i < n-1; ++i){
		for(int j = i+1; j < n; ++j){
			if(grades[i] < grades[j]){
				double temp = grades[i];
				grades[i] = grades[j];
				grades[j] = temp;
				
				String tmp = names[i];
				names[i] = names[j];
				names[j] = tmp;
			}
		}
	}

	
	    System.out.println("姓名           成绩");
	    System.out.println("------------------");
	    for (int i = 0; i < n; i++) {
	        System.out.printf("%-1s%14.1f\n", names[i], grades[i]);
	    }
	}
	 
}
