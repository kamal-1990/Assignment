package day5;
import java.util.Scanner;

import day14.Looping1;

public class Loopingtest {

	public static void main(String[] args) {
		Looping1 obj= new Looping1();
		Scanner input=new Scanner(System.in);
		String decision="";
		
		do {
			System.out.println("enter the choice: table or findsum or reverse");
			String choice=input.next();
			switch (choice) {
			case "table":
				int n=input.nextInt();
				obj.findtable(n);
				
				break;
	        case "findsum":
	        	n=input.nextInt();
	        	
	        	obj.findnthsum(n);
				
				break;
	        case "reverse":
	        	int originalnumber=input.nextInt();
	        	
	        	obj.reverseorder1(originalnumber);;
		
		break;
			default:
				System.out.println("wrong choice");
				break;
			}
			System.out.println("do you want to continue? yes or no");
			decision=input.next();
		} while (decision.equalsIgnoreCase("yes"));
		System.out.println("bye");
		 input.close();

	}


}
