package WEB19SB101C2.question2;

public class Supplier {

    public static void main(String[] args) {
        Supplier<Student> supp = ()->new Student(6,"Anup",500,"Bhopal");

        Student stud = supp.get();

        System.out.println(stud);
    }
}
