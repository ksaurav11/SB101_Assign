package dailyassignments.day10.que1;

public class ThreadA extends Thread {
	
	int total = 0 ; 
	@Override
	public void run() {

		System.out.println("thread of child starting calculation");
		synchronized (this) {
			for(int i=0;i<10;i++)
			{
				
				total+=i;
			}
			System.out.println("thread of child giving notification");
			this.notify();
		}
		
		
	}
	
	

}
