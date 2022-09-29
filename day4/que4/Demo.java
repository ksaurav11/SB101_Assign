package dailyassignment.day4.que4;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int n1 = scanner.nextInt() ; 
		int n2 = scanner.nextInt() ;
		
		try {
			int ans = n1/n2 ; 
			System.out.println("The Quotient of "+n1+"/"+n2+" is "+ans);
			
		} catch (ArithmeticException ae) {
			System.out.println("Divided By zero and exception caught");
		}
		
		finally {
			System.out.println("Inside final block");
		}

	}
	

}
