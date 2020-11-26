package day4;

import java.util.Scanner;

public class sumdemo {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		
		int b=  input.nextInt();
        int sum = a + b;
        System.out.println("the sum is " + sum);
        input.close();
	}

}
