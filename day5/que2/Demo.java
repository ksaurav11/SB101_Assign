package dailyassignment.day5.que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	
public static void main(String[] args) {
		
		
		List<String> cityList = new ArrayList<>();
		cityList.add("Patna");
		cityList.add("Bhopal");
		cityList.add("Delhi");
		

		System.out.println("Before sorting "+cityList);

		Collections.sort(cityList,(o1,o2)-> o1.compareTo(o2));
		
		
		System.out.println("after sorting "+cityList);
		
		
		
	}


}
