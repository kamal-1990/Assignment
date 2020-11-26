package day32;

public class StringDemo {
	public static void main(String[] args) {
		/* string is immutable or unchangeable.once string is created,the value of the very string cannot be change with other value.
        so,To initiaze or store some value,we have to create again new string.*/
		String s1 = "Nepal";// common way to create string
		System.out.println(s1);
		System.out.println(s1.length());

		String s2 = new String();// using new keyword,we can create string
		System.out.println(s2);

		String s3 = new String("Nepal");// here we initialize string
		System.out.println(s3);

		char[] array = { 'n', 'e', 'p', 'a', 'l' };
		String s4 = new String(array);
		System.out.println(s4);

		byte[] bb = { 78, 101, 112, 97, 108 };
		String s5 = new String(bb);
		System.out.println(s5);

		String s6 = "Nepal";
		System.out.println(s6);

		System.out.println(s1.equals(s6));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s5));

		String s7 = "Good Evening, Nepal.";
		System.out.println(s7);
		System.out.println(s7.length());
		System.out.println(s7.charAt(0));
		System.out.println(s7.charAt(5));
		System.out.println(s7.concat(" What's up?"));
		System.out.println("Wow!".concat(s7));
		System.out.println(s7.toCharArray());
		System.out.println(s7.toLowerCase());
		System.out.println(s7.toUpperCase());
		System.out.println(s7.substring(5));// it starts from index 5 i.e, "E".
		System.out.println(s7.substring(3, 10));// it finds starting and ending index.
		System.out.println(s7.indexOf('d'));// it finds location of d in index.
		char[] chh = s7.toCharArray();
		System.out.println(chh[6]);
		System.out.println(s7.contains("Nepal"));
		System.out.println(s7.contains("NEPAL"));
		System.out.println(s7.contains("e"));
		System.out.println(s7.replace("Evening", "Morning"));
		System.out.println(s7.replace("G", "M"));
		String s8 = new String(" Kamal Shahi Samundra ");
		System.out.println(s8);
		System.out.println(s8.trim());
		byte[] b = s8.getBytes();
		System.out.println(b.toString());//it finds the byte of the string.
	}

}
