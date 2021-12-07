import java.util.Scanner;
public class CalRemainDays {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("enter the month to calculate for:");
    String monthName =in.nextLine();
    
    int days =0;
    
    switch(monthName) {
    	
    case "january":
    	days+=31;
    	
    case "february":
    	days+=29;
    	
    case "march":
    	days+=31;
    	
    case "april":
    	days+=30;
    	
    case "may":
    	days+=31;
    	
    case "june":
    	days+=30;
    	
    case "july":
    	days+=31;
    	
    case "august":
    	days+=30;
    	
    case "september":
    	days+=31;
    	
    case "october":
    	days+=30;
    	
    case "november":
    	days+=31;
    	
    case "december":
    	days+=30;
    	
	default:
    		System.out.println("pls enter the correct month");
    }
    System.out.println("remaining days from this year is "+monthName+" is "+days);
    
	}

}
