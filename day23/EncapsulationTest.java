package day23;
import java.util.Scanner;

public class EncapsulationTest {

	public static void main(String[] args) {
		Encapsulation obj1=new Encapsulation();
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the firstname");
		String Fname=input.next();
		obj1.setFirstname(Fname);  //first obj create garin6a ani obj bata set() method  call garin6a and 
		                             //sangai initialize pani garin6a.
		String f=obj1.getFirstname();
		System.out.println(f);
		
		System.out.println("Enter the lastname");
		String Lname=input.next();
		obj1.setLastname(Lname);
		String l=obj1.getLastname();
		System.out.println(l);
		
		System.out.println("Enter the rollnumber");
		int Rnumber=input.nextInt();
		obj1.setRollnumber(Rnumber);
		int r=obj1.getRollnumber();
		System.out.println(r);
		
		
		// 1uta object bata many or different values linu 6a vane set() and get() method use garin6a called as encapsulation.

		System.out.println("Enter the firstname");
		String Fname1=input.next();
		obj1.setFirstname(Fname1);
		String f1=obj1.getFirstname();
		System.out.println(f1);
		
		System.out.println("Enter the lastname");
		String Lname1=input.next();
		obj1.setLastname(Lname1);
		String l1=obj1.getLastname();
		System.out.println(l1);
		
		System.out.println("Enter the rollnumber");
		int Rnumber1=input.nextInt();
		obj1.setRollnumber(Rnumber1);
		int r1=obj1.getRollnumber();
		System.out.println(r1);
		
		input.close();

	}

}
