package day32;

public class StringDemo2 {

	public static void main(String[] args) {
		// if we need mutable or changeable string then we use stringbuilder or stringbuffer as follows.
		
		StringBuilder sb= new StringBuilder("Good Morning");
		System.out.println(sb);
		sb.append(" Nepal");
		System.out.println(sb);//here sb= Good Morining Nepal where old sb change to new sb as stringbuilder is mutable string.
		sb.delete(13, 18);//here it deletes nepal using indexes.
		System.out.println(sb);
		sb.insert(0, "Hello ");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		

	}

}
