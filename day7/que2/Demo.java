package dailyassignments.day7.que2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"s0",100));
		students.add(new Student(2,"s1",150));
		students.add(new Student(3,"s2",130));
		students.add(new Student(4,"s3",170));
		students.add(new Student(5,"s4",180));
		
		Student maxStudent = students.stream()
								     .max((s1,s2)-> s1.getMarks()>s2.getMarks() ? +1:-1)
									 .get();
		System.out.println("Max marks student is  "+maxStudent);
	}

}
