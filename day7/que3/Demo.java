package dailyassignments.day7.que3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,6,8);
		
		List<Integer> newList = list.stream()
									.map(i->i*i)
									.collect(Collectors.toList());
		System.out.println("list of integer is "+list);
		System.out.println("list of squared integer is "+newList);
	}

}
