package dailyassignments.day10.que6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import dailyassignments.day10.que2.MyThreadPool;

public class Main {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyThreadPool[] m1=  {
				new MyThreadPool(1),
				new MyThreadPool(2),
				new MyThreadPool(3),
				new MyThreadPool(4),
				new MyThreadPool(5),
				new MyThreadPool(6)
		};
		
		ExecutorService service = Executors.newFixedThreadPool(6);
		
		for (MyThreadPool myThreadPool : m1) {
			Future<String> future=  (Future<String>) service.submit(myThreadPool);
			System.out.println("The number  is - "+future.get());
		}
		service.shutdown();
		
	}

}
