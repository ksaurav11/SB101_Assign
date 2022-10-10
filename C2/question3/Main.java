package WEB19SB101C2.question3;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(20,"Shrishti",400,"Nagpur"));
        stud.add(new Student(35,"Kumar",150,"Patna"));
        stud.add(new Student(10,"Anup",650,"Bhopal"));
        stud.add(new Student(45,"Aditya",350,"Delhi"));
        stud.add(new Student(25,"Shivam",800,"Bengaluru"));


        List<Employee> empl = stud.stream().filter(s->s.getMarks()>500)
                .map(s->new Employee(s.getRoll(),s.getName(),s.getMarks(),s.getAddress()))
                .collect(Collectors.toList());

        empl.forEach(e-> System.out.println(e));

    }
}
