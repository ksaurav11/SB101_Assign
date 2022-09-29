package dailyassignments.day9.que3;

public class Demo {
	
public static void main(String[] args) {
		
		ThreadA a1  = new ThreadA();
		ThreadA1 b1  = new ThreadA1(a1);
		
		a1.start();
		
		b1.start();
		
		
		

	}

}
