package practice1;

import java.util.Scanner;

public class digitsum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number more the 2 digit number");
		int digit = input.nextInt();
		int sum = 0;
		int multiple = 1;
		while (digit != 0) {

			int temp = digit % 10;
			sum = sum + temp;

			multiple = multiple * temp;

			digit = digit / 10;

		}

		System.out.println("sum of digits " + sum);
		System.out.println("the multiple of digits " + multiple);
		input.close();

	}

}
