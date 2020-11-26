package day26;

public class derived  extends base {
	// hiding variable as it hided the parent's "name" variable.
	String name="child's name";
	public void greet() {
		System.out.println("hello,good morining");
}
}
