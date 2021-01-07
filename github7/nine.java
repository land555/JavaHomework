package github7;
import java.util.Scanner;
import java.util.ArrayList;
public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the array size n: ");
		        int n = input.nextInt();
		        int[][] dick = new int[n][n];
		        ArrayList<Integer> rows = new ArrayList<>();
		        ArrayList<Integer> columns = new ArrayList<>();
		        for(int i=0;i<n;i++)
		        {
		            for(int j=0;j<n;j++)
		                dick[i][j]=(int)(Math.random()*2);
		        }
		        for(int i=0;i<n;i++)
		        {
		            int s=0;
		            for(int j=0;j<n;j++){
		                if(dick[i][j]==1)
		                    s++;
		            }
		            rows.add(s);
		        }
		        for(int j=0;j<n;j++)
		        {
		            int sum=0;
		            for(int i=0;i<n;i++){
		                if(dick[i][j]==1)
		                    sum++;
		            }
		            columns.add(sum);
		        }
		        System.out.println("The random array is ");
		        for(int i=0;i<n;i++){
		            for(int j=0;j<n;j++){
		                System.out.print(dick[i][j]+" ");
		            }
		            System.out.print('\n');
		        }
		        System.out.println("The largest row index: "+java.util.Collections.max(rows));
		        System.out.println("The largest column index: "+java.util.Collections.max(columns));
		    }
	}

