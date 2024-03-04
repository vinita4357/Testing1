package interview;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class stringreplace {
	public static void main(String[] args) {
		//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 ---access token
	//	String s="dinida";
	//	System.out.print(s.trim());
		//System.out.print(s.replace('d', 'f'));
		//System.out.print(s.length());
		
		//System.out.println(Calendar.getInstance().YEAR);
		
		//System.out.println(LocalDate.now());	
	//	System.out.println(LocalDateTime.now());	
		//SimpleDateFormat s=new SimpleDateFormat("mm/dd/yyyy");
	//	DateTimeFormatter f=DateTimeFormatter.ofPattern("mm/dd/yyyy");
	//	LocalDate l=	LocalDate.now();
	//	System.out.println(f.format(l));
		
		//   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		//   LocalDateTime now = LocalDateTime.now();  
		 //  System.out.println(dtf.format(now));  
		   
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		   LocalDate now = LocalDate.now();  
		   System.out.println(dtf.format(now)); 
	}

}
