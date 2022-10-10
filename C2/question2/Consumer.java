package WEB19SB101C2.question2;

public class Consumer {

    public static void main(String[] args) {

        Consumer<Student> cons = s->{

            System.out.println("Roll is"+s.getRoll());
            System.out.println("Name is"+s.getName());
            System.out.println("Marks is"+s.getMarks());
            System.out.println("Address is"+s.getAddress());
        };

        cons.accept(new Student(2,"Kumar",100,"Patna"));
    }
}
