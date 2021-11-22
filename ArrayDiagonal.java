import java.util.Scanner;
public class ArrayDiagonal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("how many rows do you want :");
		int rowSize = in.nextInt();
		
		System.out.println("how many columns do you want :");
		int colSize = in.nextInt();
		
		int arr[][] = new int[rowSize][colSize];
		
		for(int rowCtr =0; rowCtr<rowSize; rowCtr++) 
		{
			
			for(int colCtr =0; colCtr<colSize; colCtr++) 
			{
				arr[rowCtr][colCtr] = in.nextInt();
				
			}
		}
		System.out.println("2d array with diagonal :");
		for(int rowCtr =0; rowCtr<rowSize; rowCtr++) 
		{
			for(int colCtr =0; colCtr<arr[rowCtr].length; colCtr++) 
			{
				System.out.print(arr[rowCtr][colCtr]+" ");
				
			}
			System.out.println();
		}
		System.out.println("2d array without diagonal :");
		for(int rowCtr =0; rowCtr<rowSize; rowCtr++) 
		{
			for(int colCtr =0; colCtr<arr[rowCtr].length; colCtr++) 
			{
				if(arr[rowCtr] == arr[colCtr]) 
				{
					continue;
				}
				System.out.print(arr[rowCtr][colCtr]+" ");
				
			}
			System.out.println();
		}
	}
}
