package WEB19SB101C2.question4;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class List {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Kumar");
        name.add("Saurav");
        name.add("Anup");
        name.add("Aditya");
        name.add("Shivam");
        name.add("Shrishti");
        name.add("Shekhar");
        name.add("Prasad");
        name.add("Verma");
        name.add("Gaurav");

        List<String> filteredList = List.stream().filter(n->n.length()%2==0)
                .sorted((n1,n2)->n2.compareTo(n1))
                .collect(Collectors.toList());

        name.forEach(old-> System.out.println(old));

        filteredList.forEach(newList-> System.out.println(newList));


    }

}
