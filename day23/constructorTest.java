package day23;

public class constructorTest {

	public static void main(String[] args) {
		Constructor object1=new Constructor("kamal",30,500); 
		object1.display();
		/* yaha 1uta object1 create garera initialize gariyo tara object1ko value sadhai 1utai hun6a,it cannot be changed.aru kunai 
		value rakhnalai new object2 create garnupar6a tara set() method use garda object1ko value change garna milthyo*/
		
        Constructor object2= new Constructor("kabita",29,1000);
        object2.display();
	}

}
