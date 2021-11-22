import java.util.Scanner;
public class Array2d {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("how many rows do you want?:");
		int rows  = input.nextInt();
		
		System.out.println("how many columns do you want?:");
		int cols = input.nextInt();
		
		//getting rows and cols from the users
		int myArray[][] = new int[10][10];
		
		for(int i =0; i<rows; i++) {
			for(int ctr=0 ; ctr<cols; ctr++) {
				myArray[i][ctr] = input.nextInt();
			}
		}
		for(int i = 0; i<rows;i++) {
			for(int ctr =0; ctr<cols; ctr++) {
				System.out.print(myArray[i][ctr]);
			}
		}System.out.println();
		
		
	}

}
