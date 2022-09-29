package dailyassignment.day11.que4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoC {
	
public static void main(String[] args) throws IOException {
		
		Path p1 = Paths.get("d://mobile.txt");
		 Path p2 = Paths.get("d://IndianMobile.txt");
		
		List<String> moList= Files.readAllLines(p1);
		
		moList.forEach(s->{
			 Pattern p = Pattern.compile("[(mob:9)(mob:7)(mob:8)]");
			  Matcher m = p.matcher(s);
			  while(m.find()) {
				 
				  try {
					Files.write(p2,s.getBytes());
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			  }
		});
		  
		 List<String>newmoList = Files.readAllLines(p2);
		 
		 newmoList.forEach(s->System.out.println(s));

		
		}

}
