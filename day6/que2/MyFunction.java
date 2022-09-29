package dailyassignments.day6.que2;

import java.util.function.Function;

import dailyassignments.day6.que3.Student;

public class MyFunction {
	
public static void main(String[] args) {
		
		Function<Student, String> f1 = s-> s.getMarks()>300 ?"pass":"fail";
		System.out.println(f1.apply(new Student(10,"ram","ram@gmail.com",400)));

	}

}
