package dailyassignment.day11.que1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner scanner =  new Scanner(System.in);
		File f =  new File("d://abc.txt");
		FileWriter fw = new FileWriter(f);
		System.out.println("Enter name ");
		String name = scanner.next();
		System.out.println("Enter address");
		String addString= scanner.next();
		fw.write("Employee name:- "+name);
		fw.write("\n");
		fw.write("Address:-"+addString);
		fw.flush();
		fw.close();
		System.out.println("Completed");

}

}
