package dailyassignments.day10.que2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
public static void main(String[] args) {
		
		MyThreadPool[] m1 = {new MyThreadPool("ram"),
				new MyThreadPool("shyam"),
				new MyThreadPool("suresh"),
				new MyThreadPool("mukesh"),
				new MyThreadPool("rishabh"),
				};
		
		ExecutorService service= Executors.newFixedThreadPool(4);
			
			for (MyThreadPool myThreadPool : m1) {
				service.submit(myThreadPool);
			}
			
			service.shutdown();
			
		

	}

}
