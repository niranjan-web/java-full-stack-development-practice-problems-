import java.util.Scanner;

public class ArrayFor2d 
{

	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);

		 // enter row and column for array.
	    System.out.print("Enter row for the array: ");
	    int  row = input.nextInt(); 
	    
	    System.out.print("Enter column for the array: ");
	    int  col = input.nextInt();
	    
	    int arr[][] = new int[row][col];
	    //System.out.println(arr.length);
	    
	    System.out.println("enter "+(row*col)+" elements");													
	    for(int rows=0; rows<row; rows++)
	    {       													 // row= arr.length			//int rows =0;
	    	for(int cols= 0; cols<col; cols++) 
	    	{ 														 //arr[0][1] ={3,4,5}   -->4 ,col = arr[row].length		//while(rows<arr.length){
	    		arr[rows][cols]= input.nextInt();																
		    }
	    }
		 System.out.println("the 2d array is :");
		 	for(int rows=0; rows<arr.length; rows++)
		 	{
		 		for(int cols= 0; cols<arr[rows].length; cols++)
		 		{
		 			System.out.print( arr[rows][cols]+"  " );
		    	}
		    		System.out.println();
			}
	}
}																				 			//if( rows == cols)
																								 			//	System.out.println(0);
																						//		 			if(arr[rows][cols] ==arr[2][2])
																						//		 				System.out.println(0);
																		                 //		 			if(arr[rows][cols] ==arr[1][1])
																						//		 				System.out.println(0);
		 			
    		


