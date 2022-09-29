package dailyassignments.day10.que6;

import java.util.concurrent.Callable;

public class MyThreadPool implements Callable<String> {
	
int num ; 
	
	

	public MyThreadPool(int num) {
		super();
		this.num = num;
	}

	

	@Override
	public String call() throws Exception {
		
		if(num%2==0) {
			return "Even Number" ; 
		}else {
		return "Odd Number";
		}
	}

}
