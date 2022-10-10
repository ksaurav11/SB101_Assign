package WEB19SB101C2.question2;

import WEB19SB101C2.question3.Student;

import java.util.function.Predicate;

public class Predicate {

    public static void main(String[] args) {
        Predicate<Student> predi = s->s.getMarks()>500;
        System.out.println(predi.test(new Student(5,"Kumar",100,"Patna")));
        System.out.println(predi.test(new Student(6,"Anup",500,"Bhopal")));
    }
}
