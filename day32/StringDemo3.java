package day32;

public class StringDemo3 {

	public static void main(String[] args) {
		// StringBuilder are not synchronized or are not thread safe but string buffer are thread safe.
		// they both have same methods.
		
		StringBuffer sb= new StringBuffer("Good Morning");
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
