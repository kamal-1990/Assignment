package question24and31;

public class solution24 {
	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;
	}
	public void series(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();

		}

	}
}
