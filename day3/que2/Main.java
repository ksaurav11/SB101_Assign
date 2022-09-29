package dailyassignments.day3.que2;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	
public static void CalculateAge(Date date) {
		
//		System.out.println(date.toString());
		
		int years = 0 ; 
		int months = 0 ; 
		int days= 0; 
		
		Calendar birthday = Calendar.getInstance();
		birthday.setTimeInMillis(date.getTime());

		long currentTime =  System.currentTimeMillis();
		Calendar now = Calendar.getInstance();		
		now.setTimeInMillis(currentTime);
		
		years = now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
//		System.out.println(years);
		/* calculate month*/
		int cuurmonth =  now.get(Calendar.MONTH);
		int birthmonth =  birthday.get(Calendar.MONTH);
		
		months = cuurmonth-birthmonth ;
		
		if(months<0) {
			years--;
			months =12-cuurmonth+birthmonth ;
			if(now.get(Calendar.DATE)<birthday.get(Calendar.DATE))
				months--;
		}else if(months==0 && now.get(Calendar.DATE) < birthday.get(Calendar.DATE)) {
			years--;
			months=11;
		}
   /*Calculate days*/
		
		if(now.get(Calendar.DATE)>birthday.get(Calendar.DATE))
		{
			days = now.get(Calendar.DATE) - birthday.get(Calendar.DATE);
		}else if(now.get(Calendar.DATE)<birthday.get(Calendar.DATE))
		{
			int today =  now.get(Calendar.DAY_OF_MONTH);
			now.add(Calendar.MONTH, -1);
	         days = now.getActualMaximum(Calendar.DAY_OF_MONTH) - birthday.get(Calendar.DAY_OF_MONTH) + today;

		}else {
			 days = 0;
	         if (months == 12)
	         {
	            years++;
	            months = 0;
	         }
		}
		if(years<0) {
			System.out.println("“Date should not be in Future");
		}else {
			System.out.println(days+" days "+months+" months "+years+" years");
		}
		
	 	
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the date in \"dd/MM/yyy\" formate ");
		String date = scanner.next();
//		String date = "23/03/1996";
		
		try {
			Date date1 =  (Date) new SimpleDateFormat("dd/MM/yyy").parse(date);
			CalculateAge(date1);
		} catch (ParseException e) {
			
			System.out.println("Please enter the date in correct format");
		}
		
	}

}


