package day1;
import java.util.Scanner;



public class Charater {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the charater you want:");
		char ch=input.next().charAt(0);
		int asciivalue=(int)ch;
		System.out.println("the ascii value for "+ch+" is "+asciivalue); 
		input.close();
	
		
	}

}
