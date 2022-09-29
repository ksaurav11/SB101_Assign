package dailyassignments.day6.que2;

import java.util.function.Consumer;

import dailyassignments.day6.que3.Student;

public class MyConsumer {
	
public static void main(String[] args) {
		
		Consumer<Student> c1= s -> {
			
			System.out.println("Roll is "+s.getRoll());
			System.out.println("Name is "+s.getName());
			System.out.println("Email is "+s.getEmail());
			System.out.println("Marks is "+s.getMarks());
			
		};
		c1.accept(new Student(10, "Kumar", "kr@gmail.com", 100));

	}

}
