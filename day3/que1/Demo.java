package dailyassignments.day3.que1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public class Main {
		public static void main(String args[])
		{ 
			System.out.println("start of main..");
		
		
		try {
			Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		int number1 = sc.nextInt();
		System.out.println("Enter number2");
		int number2 = sc.nextInt();
		String message = null;	
		
			int num3 = number1 / number2;
			if(num3 > 10){
			message = "Welcome to Exception Handling ";
			}
			System.out.println("Message is :"+message.toUpperCase());
			
		} catch (InputMismatchException ie) {
			System.out.println("Please enter valid number");
		}
		catch (ArithmeticException ae) {
			System.out.println("number2 should not be zero");
		}
		catch (NullPointerException npe) {
			System.out.println("String value is null");
		}
		
		
		
		System.out.println("end of main");
		} 

	}

}
