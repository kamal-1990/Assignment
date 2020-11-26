package question24and31;
import java.util.Scanner;

public class test24 {

	public static void main(String[] args) {
	    
        Scanner input =new Scanner(System.in);
        System.out.println("enter the desired number");
        int n=input.nextInt();
       
        solution24 obj=new solution24();
        String decision=" ";
        do {
        	 System.out.println("enter the choice: factorial|series");
             String choice=input.next();
		
        switch (choice) {
		case "factorial":
			int f=obj.factorial(n);
			System.out.println("the factorial of "+n+"is:" +f);
			
		break;
		
        case "series":
        	obj.series(n);
        	
	
	
			
	    break;
	    
		default:
			
			break;
		}
        System.out.println("do you want to continue");
        decision=input.next();
        } while (decision.equalsIgnoreCase("yes"));
        
        
       input.close(); 

	}

}
