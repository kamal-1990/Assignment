package day14;

public class Looping1 {
	public void findtable(int n) {
		for (int i = 1; i <= 10; i++) {
			int table = n * i;
			System.out.println("the table of " + n + "is:" + n + "=" + i + "*" + table);

		}

	}

	public void findnthsum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {

			sum = sum + i;
		}
		System.out.println("the sum of nth number is: " + sum);

	}

	public void reverseorder1(int originalnumber) {
		int reversenumber = 0;
		while (originalnumber != 0) {
			int temp = originalnumber % 10;
			reversenumber = reversenumber * 10 + temp;
			originalnumber = originalnumber / 10;

		}
		System.out.println("the reverse number of original number is " + reversenumber);

	}

}
