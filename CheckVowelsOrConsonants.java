import java.util.Scanner;
public class CheckVowelsOrConsonants 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the sentence to check for :");
		String sentence =in.nextLine();
		
		int vowels,consonants,spaces;
		vowels=consonants=spaces=0;
		
		int ctr =0;
		while(ctr< sentence.length())      //
		{
			 char ch =sentence.charAt(ctr);
			switch(sentence.charAt(ctr))
			{
			case 'a','e','i','o','u':
			System.out.println( ch+" is a vowel ");
			vowels+=1;
			break;
			
			case ' ':
			System.out.println( "_"+" is a space ");
			spaces+=1;
			break;
			
			default:
			System.out.println( ch+ " is a consonants");
			consonants+=1;
			}
			ctr++;
		}
		System.out.print("there are "+"'"+vowels +"'"+ "vowels and ");
		System.out.print("'"+consonants+"'"+" consonants and ");
		System.out.println("'"+spaces+"'"+" spaces in the sentence that you have entered");

		
	}

}
