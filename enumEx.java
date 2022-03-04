import java.util.Scanner;
import java.util.*;
enum Country {

   US {

       public String getCurrency() {
           return "DOLLAR";
       }
   }, RUSSIA {

       public String getCurrency() {
           return "RUBLE";
       }
   }, INDIA {

       public String getCurrency() {
           return "RUPEE";
       }
   };

   public abstract String getCurrency();
}

public class enumEx {
   public static void main(String[] args) {
       for (Country country : Country.values()) {
           System.out.println(country.getCurrency() + " is the currecny of " + country.name());
       }
   }
}





/*
public class enumEx {
	
	public enum weak{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATERDAAY
	}
	
	public static void main(String[]args) {
		
		for(weak w : weak.values()) 
			
			System.out.println(w);
		
		System.out.println("Index of SUNDAY is: "+weak.valueOf("SUNDAY").ordinal());  
		System.out.println("Index of THURSDAY is: "+weak.valueOf("THURSDAY").ordinal()); 
		
	weak w= weak.FRIDAY;
	System.out.println(w);
	
	}
	
	 
	}


*/

