package day32;

import java.util.StringTokenizer;

public class SplitDemo {

	public static void main(String[] args) {
		String lines = "Hello,I am Kamal Pariyar,I am learning java,I am a student of Santosh Sir,I am from Irving TX.";
		String[] words = lines.split(" ");
		for (String w : words) 
		{
			System.out.println(w);
		}
		System.out.println("====================");
		
		words = lines.split(",");
		for (String w : words) 
		{
			System.out.println(w);

		}
		System.out.println("====using tokenizer====");
	    lines = "Hello,I am Kamal Pariyar,I am learning java,I am a student of Santosh Sir,I am from Irving TX.";
	    StringTokenizer st= new StringTokenizer(lines);
	    while (st.hasMoreTokens()) {
	    	System.out.println(st.nextToken());
			
		}
	    
		
		

	}

}
