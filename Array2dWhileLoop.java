import java.util.Scanner;
public class ArrayWhile2d {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("how many rows do you want :");
		int rowSize = in.nextInt();
		
		System.out.println("how many columns do you want :");
		int colSize = in.nextInt();
		
		int arr[][]= new int[rowSize][colSize];
		
		int row =0;
		while(row < rowSize) //rowsize =arr.length
		{
			int col =0;
			while(col <colSize) 				//
			{
				arr[row][col] = in.nextInt();
				col++;
			}
			row++;
		}
		
		System.out.println("the 2d array is ");
		int row1=0;
		while(row1 < rowSize) //rowsize =arr.length
		{
			int col = 0;
			while(col <arr[row1].length) 				//
			{
				System.out.print(arr[row1][col]+" ");
				col++;
			}
			row1++;
			System.out.println();
		}
	}

}
