package github1;
import java.util.Scanner;
public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner input=new Scanner(System.in);
 System.out.print("Enter annual intereset rate,e.g.,7.25%:");
 double annualInterestRate=input.nextDouble();
 double monthInterestRate=annualInterestRate/1200;
 System.out.print("Enter numbber of year as an intager,e.g.,5:");
 int numberOfYears=input.nextInt();
 System.out.print("Enter loan amount,e.g.,120000.95:");
 double loanAmount=input.nextDouble();
 double monthlypayment=loanAmount*monthInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfyears*12));
 double totalPayment=monthlyPayment*numberOfYears*12;
 System.out.println("The monthly payment is $"+(int)(monthlyPayment*100)/100.0);
 System.out.println("The total payment is $"+(int)(totalyPayment*100)/100.0);

	}

}
