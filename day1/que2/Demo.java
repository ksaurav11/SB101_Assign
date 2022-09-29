package dailyassignments.day1.que2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
	
	public static void main(String[] args) {
	    Map<Student,Integer> studenttoroll = new TreeMap<>(new StudentCompareTomarks());
	        Student s1 = new Student(99,"one");
	        Student s2 = new Student(100,"two");
	        Student s3 = new Student(101,"three");

	        studenttoroll.put(s1,1);
	        studenttoroll.put(s2,2);
	        studenttoroll.put(s3,3);
	        System.out.println(studenttoroll);
	    }
	}

	class StudentCompareTomarks<Student> implements Comparator<com.masai.Student> {

	    @Override
	    public int compare(com.masai.Student o1, com.masai.Student o2) {

	        /*
	        ascending order;
	        */


	        if(o1.marks>o2.marks)
	            return  1 ;
	        else if (o1.marks<o2.marks) {
	            return -1;
	        }else{
	            return 0;
	        }

	        /*descending order */
	        /*
	         if(o1.marks>o2.marks)
	            return  1 ;
	        else if (o1.marks<o2.marks) {
	            return -1;
	        }else{
	            return 0;
	        }
	         */
	    }
	}


	//student class

	class Student{
	    Integer marks;
	    String name;

	    public Student(Integer marks, String name) {
	        this.marks = marks;
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "Student{" +
	                "marks=" + marks +
	                ", name='" + name + '\'' +
	                '}';
	    }

}
