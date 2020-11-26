package practice1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int sum = 0;
		int t1 = 0;
		int t2 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int n = input.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.print(t1+" ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}

		input.close();

	}

}
