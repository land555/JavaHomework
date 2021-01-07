package github2;

import java.util.Scanner;
public class WhatDayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] week = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		System.out.print("Enter year:");
		int year = input.nextInt();
		System.out.print("Enter month 1-12:");
		int month = input.nextInt();
		System.out.print("Enter the day of the month:");
		int day = input.nextInt();
		int m = 0;
		if(month == 1 || month == 2){
			m = month+12;
			--year;
		}
		else
			m = month;
		int k = year%100;
		int j = year/100;
		int h = (day + 26*(m+1)/10 + k + k/4 + j/4 + 5*j) % 7;
		System.out.print("day of the week is");
		System.out.println(week[h]);
	}
 
}
