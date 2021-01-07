package github2;

import java.util.Scanner;

public class Commercialinspection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner input = new Scanner(System.in);
				System.out.print("Enter the first 9 digits of an ISBN as integer: ");
				String nums = input.next();
				int s = 0;
				for(int i = 0; i < 9; ++i){
					int num = (int)(nums.charAt(i) - '0');
					s += num*(i+1);
				}
				s %= 11;
				System.out.print("The ISBN - 10 number is ");
				System.out.print(nums);
				if(s == 10)
					System.out.println("X");
				else
					System.out.println(s);
			}
		}

