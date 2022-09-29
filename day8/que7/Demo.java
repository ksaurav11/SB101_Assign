package dailyassignments.day8.que7;

import dailyassignment.day4.que1.Main;

public class Demo implements Runnable {
	
	@Override
	public void run() {
		System.out.println("inside run with "+Thread.currentThread().getName()+" with priority "+Thread.currentThread().getPriority());
			
		
	}

	public static void main(String[] args) {
		
		Main m1= new Main();
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		
		
		t1.setPriority(8);
		t2.setPriority(10);
		t1.setName("Dhoni");
		t2.setName("kohli");
		t1.start();
		t2.start();
		
		
	}

}
