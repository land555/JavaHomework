package github3;
import java.util.Scanner;
import java.util.Arrays;
public class seventeen {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	 
	    int n;
	    System.out.print("������ѧ���ĸ�����");
	    n = input.nextInt();
	 
	    String[] names = new String[n];
	    double[] grades = new double[n];
	    for (int i = 0; i < n; i++) {
	        System.out.print("�������" + (i + 1) + "ѧ����������");
	        names[i] = input.next();
	        System.out.print("�������" + (i + 1) + "ѧ���ĳɼ���");
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

	
	    System.out.println("����           �ɼ�");
	    System.out.println("------------------");
	    for (int i = 0; i < n; i++) {
	        System.out.printf("%-1s%14.1f\n", names[i], grades[i]);
	    }
	}
	 
}
