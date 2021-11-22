import java.util.Scanner;
public class PositiveOrNegativeFor {
	public static void main(String[] args) {
		//creating scanne
		Scanner scannerObj = new Scanner(System.in);
		System.out.print("how many number you want to enter: ");
		System.out.println();
		int num = scannerObj.nextInt();
		
		int value[] = new int[num];
		
			for(int ctr=0;ctr<value.length;ctr++) 			//num = value[].length
			    {
			    	System.out.print("enter the "+ ctr +" number: ");
			    	value[ctr] = scannerObj.nextInt(); 
			    	checkDivisibility(value[ctr]);		//value[ctr] =value[0] -->7
			    }
			    System.out.println();
				}
			//method 
		public static void checkDivisibility(int value) {
		if(value > 0 && value%7 !=0) 
	    {
		System.out.println(value +" is a positive number but not divisible by 7");//array val should be positive & remainder of array%7 should not be 0
		}
		else if(value >0 && value%7 ==0) 
		{
		System.out.println( value +" is a positive number and also divisible by 7");//array val should be positive & remainder of array%7 should be 0
		}
		else if(value < 0 && value %7 ==0)
		{
		System.out.println(value+" is a negative number and also divisible by 7");//array val should be less than 0 & remainder of 7 should be 0
		}	
		else if (value==0)
		{
		System.out.println(value+" is a neutral number");
		
		}
		else {
			System.out.println(value+" is a negative number but not divisible by 7");//otherwise num will be a negative no 
		}System.out.println();
}
}