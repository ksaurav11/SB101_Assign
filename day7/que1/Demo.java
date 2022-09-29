package dailyassignments.day7.que1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(10,"p1",12,90));
		list.add(new Product(20,"p2",14,120));
		list.add(new Product(30,"p3",8,150));
		list.add(new Product(40,"p4",9,50));
		list.add(new Product(50,"p6",11,30));

	 List<Product> filteredList =	list.stream()
			 							.filter(p->p.getQuantity()>10)
			 							.sorted((p1,p2)->p2.getProductId()-p1.getProductId())
			 							.collect(Collectors.toList());
	 
//	 Collections.sort(filteredList,(p1,p2)-> p2.getProductName().compareTo(p1.getProductName()));
	 
				 for(Product p:filteredList) {
					 System.out.println(p);
				 }
		
		
	}

}
