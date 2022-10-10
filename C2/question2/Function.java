package WEB19SB101C2.question2;

public class Function {

    public static void main(String[] args) {
        Function<Student,String> func = s->s.getMarks()>500 ? "Pass" "Fail";
        System.out.println(func.apply(new Student(6,"Anup",500,"Bhopal")));
        System.out.println(func.apply(new Student(10,"Aditya",300,"Delhi")));
    }
}
