package dailyassignment.day5.que5;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
public static void main(String[] args) {
		
		List<Product> plist = new ArrayList<>();
		plist.add(new Product(1, "p1", 2, 100));
		plist.add(new Product(2, "p2", 3, 500));
		plist.add(new Product(3, "p3", 2, 700));
		plist.add(new Product(4, "p4", 1, 200));
		plist.add(new Product(5, "p5", 5, 400));
		
		System.out.println(plist);
		plist.sort((o1,o2)-> o1.getPrice()-o2.getPrice());
		System.out.println("after sorting ");
		System.out.println(plist);
	}

}
