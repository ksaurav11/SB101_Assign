package dailyassignments.day2.que2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
	
public static void main(String[] args) {
		
		List<String>  city =  new ArrayList();
		city.add("Delhi");
		city.add("Patna");
		city.add("Nagpur");

		
		PrintList printList = (city1)  -> {
			for(String cityname:city1) {
				System.out.println("welcome "+cityname);	
			}
		};
		
		
		printList.display(city);
	}
	

}

interface PrintList {
abstract void display(List<String> city);
}


