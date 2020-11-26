package day19;

import java.util.Scanner;

public class forEachloop {
	public int maxElement(int[] score) {
		int maxofarray = score[0];
		for (int max : score) {
			if (max > maxofarray) {
				maxofarray = max;

			}

		}
		return maxofarray;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[] { 11, 22, 33, 44, 55 };

		for (int a : array) {
			System.out.println(a);

		}
		System.out.print("enter the size of array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println(" enter the elements inside the array: ");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = input.nextInt();

		}
		int total = 0;
		for (int b : arr) {
			System.out.println(b);
			total = total + b;

		}
		System.out.println("the sum of array is: " + total);

		forEachloop obj = new forEachloop();
		int[] score = new int[] { 75, 85, 90, 60, 55 };
		int number = obj.maxElement(score);
		System.out.println("max of array: " + number);

		input.close();

	}
}
