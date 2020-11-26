package day26;

public class SubClass extends SuperClass {
	
	//'super' keyboard is used inside of non-static methods and constructor of child class only.
	String name=" child's class";
	// this constructor is default given by java and no change will be there if it is not keep in subclass class.
	public SubClass() {
		super();
	}
	public SubClass(int a) {
		
		System.out.println("the value of a in child class is "+ a);
		
		
	}
	
	
	public void greet() {
		System.out.println("we are in a child's class");
		System.out.println(name);
		System.out.println(super.name);
		super.greet();
	}

}
