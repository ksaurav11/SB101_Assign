package dailyassignments.day1.que1;

import java.util.HashMap;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Bihar", "Patna");
		hm.put("Maharashta", "Mumbai");
		hm.put("MP", "Bhopal");
		hm.put("West Bengal", "Kolkata");
		hm.put("Karnataka", "Bengaluru");
		
		
		Set<HashMap.Entry<String, String>> states  = hm.entrySet();
		
		System.out.println("The Indian states and their Capital is - ");
		for(HashMap.Entry<String, String> x:states) {
			System.out.println(x.getKey()+"  -------->  "+x.getValue());
		}
	}

}
