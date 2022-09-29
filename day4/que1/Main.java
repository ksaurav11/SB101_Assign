package dailyassignment.day4.que1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Integer - ");
		String string = scanner.next();
		try {
			int num = Integer.parseInt(string);
			System.out.println("the square value is "+ num*num);
		} catch (NumberFormatException nfe) {
			System.out.println("entered input is not a valid format");
		}
		
		System.out.println("The work has been completed successfully ");
	}

}
