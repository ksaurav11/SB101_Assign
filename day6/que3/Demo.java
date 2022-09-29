package dailyassignments.day6.que3;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	
public Map<String, Student> sortMapUsingStudentName(Map<String, Student>originalMap){
		
		
		Set<Map.Entry<String, Student>> set = originalMap.entrySet();
		List<Map.Entry<String, Student>> Studentlist = new LinkedList<>(set);
		
		Collections.sort(Studentlist,(s1,s2)-> s1.getValue().getName().compareTo(s2.getValue().getName()));
		
		Map<String, Student> hMap = new LinkedHashMap<>();
		
		for(Map.Entry<String, Student> s:Studentlist) {
			hMap.put(s.getKey(),s.getValue());
		}
		
		return hMap;
		
		
	}

	public static void main(String[] args) {
		Map<String, Student> hMap = new HashMap<>();
		
		hMap.put("banglore", new Student(1,"Kumar","kr@gmail.com",200));
		hMap.put("chennai", new Student(2,"Anup","anup@gmail.com",320));
		hMap.put("Bhopal", new Student(3,"Shri","shri@gmail.com",100));
		hMap.put("Indore", new Student(4,"Adi","adi@gmail.com",240));
		hMap.put("Delhi", new Student(5,"Shekhar","shekhar@gmail.com",300));
		
		Demo d1 = new Demo();
		 Map<String, Student> newMap =  d1.sortMapUsingStudentName(hMap);
		 
//		for(Map.Entry<String, Student> students:newMap.entrySet()) {
//			System.out.println(students.getKey()+"   - -   "+students.getValue());
//		}
		 newMap.forEach((s1,s2)->System.out.println(s1+" ----  "+s2));
		 
	}

}
