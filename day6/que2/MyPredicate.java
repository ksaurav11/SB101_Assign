package dailyassignments.day6.que2;

import java.util.function.Predicate;

import dailyassignments.day6.que3.Student;

public class MyPredicate {
	
public static void main(String[] args) {
		
		Predicate<Student> p1 = s-> s.getMarks()>200?true:false;
		System.out.println(p1.test(new Student(10, "Adi", "adi@gmail.com", 300)));
		System.out.println(p1.test(new Student(10, "Shri", "shri@gmail.com", 100)));

	}

}
