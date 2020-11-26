package day26;

public class base {
   //1.private data members and member function cannot be used to invoke.
//2.hidden variable or data member cannot be used to invoke or call.
	//3.overridden method cannot be used to call.overridden is possible when all access modifier,return type and 
	//method name are same to both class.nor static  or private nor final methods.


	
	// here name is hidden variable.same case with methods.
	String name="parent's name";//if string was a private member then it wouldnot be inherited in main.
     public void greet() {
	System.out.println("hello,good evening");
}
}
