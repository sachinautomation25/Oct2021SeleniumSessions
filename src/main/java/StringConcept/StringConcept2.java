package StringConcept;

public class StringConcept2 {

	public static void main(String[] args) {
		
		String s=new String("Rahul");//in this way string object can be created. New keyword ensured new object created in heap and Jvm check 
		//string literal Rahul in scp and not present then create object in scp.In this way two object get created.
		
		//string immutable, trying to concate string s ,result is new string object creation
		System.out.println(s);
		System.out.println(s.hashCode());
		
		//s.concat("Arora");
		 s=s.concat("Arora");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		
		
		
	}
}
