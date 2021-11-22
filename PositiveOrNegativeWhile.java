import java.util.Scanner;
public class PositiveOrNegativeWhile {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		  
//		System.out.println("enter the how many numbers you want to enter :");
//		int num = in.nextInt();
		
		int arr[] = new int[5];
		
		int ctr =0;
		
		System.out.println("enter the any number to check wheather its +ve or -ve and divisible by 7 or not:");
		while(ctr<arr.length) {
			arr[ctr] =in.nextInt();
			if(arr[ctr]>0) {
				if(arr[ctr]%7 ==0) {
					System.out.print(arr[ctr] + " is positive and divisible by 7");
				}else
					System.out.print(arr[ctr]+ " is positive but not divisible by 7");
				System.out.println();
			} else if(arr[ctr]<0) {       //else is necessary
				if(arr[ctr]%7 ==0) {
					System.out.print(arr[ctr] +" is negative and divisible by 7");
				}else 
					System.out.print(arr[ctr]+" is negative but not divisible by 7");
				System.out.println();

			}else
				System.out.print("it is a zero");
			//ctr++; -->for infinitely
			System.out.println();
		}
		System.out.println();
		
	}

}
