import java.util.Scanner;
public class CalculatorUsingIf {
	
		public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
				
		System.out.println("enter the number1:");
		int num1 = obj.nextInt();
		
		System.out.println("enter the number2:");
		int num2 = obj.nextInt();
		
		
		System.out.println("choose the operator: +, -,*, /,%");
		char operation =obj.next().charAt(0);//
		
		if(operation == '+' ) {
			
			System.out.println(num1+num2);
		}
		else if(operation =='-' ) {
			
			System.out.println(num1-num2);
		}
		else if(operation == '*') {
			
			System.out.println(num1*num2);
		}
		else if(operation == '/') {
			
			System.out.println(num1/num2);
		}
		else if(operation == '%'){
				System.out.println(num1%num2);
			}
		   else {
				System.out.println("pls enter a correct operator to perform.");
		   }
	

}	
}
