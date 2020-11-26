package day23;

public class Constructor {
	private String name;
	private int age;
	private float property;
	
	
	public Constructor(String n,int a,float p) {
		name=n;
		age=a;
		property=p;

}
	public void display() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("property :"+property);
	}
	
}
