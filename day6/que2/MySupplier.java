package dailyassignments.day6.que2;

import java.util.function.Supplier;

import dailyassignments.day6.que3.Student;

public class MySupplier {
	
	public static void main(String[] args) {
		Supplier<Student> s1 = ()-> new Student(10, "Adi", "adi@gmail.com", 100);
		System.out.println(s1.get());
		
		
		
	}

}
