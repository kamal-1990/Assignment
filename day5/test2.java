package day5;



public class test2 {

	public static void main(String[] args) {
		demo2 obj=new demo2();
		int a1 =obj.findsum();
		System.out.println("the sum is: "+ a1);
		int b1=obj.findsubstract();
		System.out.println("the substract is: " +b1);
		int x=6;
		int y=4;
		int x1=demo2.findMax(x,y);
		System.out.println("the max value is: "+ x1);
		int m=6;
		int n=8;
		obj.findaverage(m,n);
		String name="kamal";
		int age=30;
		String adr="irving";
		obj.printinfo(name,age,adr);
		
		
		
		


	}

}
