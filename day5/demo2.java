package day5;

public class demo2 {
	
	public int findsum() {
        int a=3;
        int b=4;
        int sum=a+b;
        return sum;
}
	public int findsubstract() {
		int c = 10;
		int d = 6;
		int substract=c-d;
		return substract;
}
	public static int findMax(int x,int y) {
		int max=0;
		if(x>y) {
			max=x;
			System.out.println("max number is: "+ max);
		}else {
			max=y;
			System.out.println("the max is: " + max);
		}
		return max;
		
	}
	public void findaverage(int m, int n) {
		int avg=(m+n)/2;
		System.out.println("the average is: "+ avg);
		
		
	}
	public void printinfo(String name,int age,String adr) {
		System.out.println("the name is: "+ name);
		System.out.println("the age is: "+ age);
		System.out.println("the address is: "+ adr);
	}
	
}
