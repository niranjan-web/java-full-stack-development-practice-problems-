import java.util.Scanner;
public class CalculatorAssesment {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the 1st number:");
		float num1 = obj.nextInt();
		
		System.out.println("enter the 2nd number:");
		float num2 = obj.nextInt();
		
		System.out.println("enter the operator only in 'add for +', 'sub for -','mul for *', 'divide for /','modulo for %:'");
		String operator =obj.next();
		
		
		switch (operator){
		case "add": 
		case "+":
		case "addition":
			System.out.print("added value is " +(num1+num2));
			break;
			
		case "sub":
		case "-":
			System.out.print("subtracted value is " +(num1- num2));
			break;
			
		case "multiply":
		case "*":
			System.out.print("multiplied value is "+ (num1*num2));
			break;
			
		case "divide":
		case "/":
			System.out.print("divided value is "+ (num1/num2));
			break;
			
		case "modulo":
		case "%":
			System.out.println("modulo value is "+ (num1%num2));
			break;
			
			default:
				System.out.println("enter the correct operator");
			
		}
			
//		if(operator.equals("add") ) 										
//		{
//			System.out.print("added value is " +(num1+num2));
//		}
//		else if(operator.equals("sub"))
//		{
//			System.out.print("subtracted value is " +(num1- num2));
//		}
//		else if(operator.equals("multiply")) 
//		{
//			System.out.print("multiplied value is "+ (num1*num2));
//		}
//		else if(operator.equals("divide")) 
//	    {
//			System.out.print("divided value is "+ (num1/num2));
//	    }
//	    else if(operator.equals("modulo")) 
//	    {
//			System.out.println("modulo value is "+ (num1%num2));
//	    }
//	    else 
//	    {
//	    	System.out.println("pls enter the correct operator");
//	    }
	}
}

