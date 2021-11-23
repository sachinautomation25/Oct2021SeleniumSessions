package StringConcept;

/*
 * two or more string can be concatenation by using + operator
 * string can be concatenation with other data type
 */
public class StringConcatenation {

	public static void main(String[] args) {

		String s1 = "way";
		String s2 = "2";
		String s3 = "automation";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1 + s2 + s3);
		System.out.println((s1 + s2 + s3).length());
		int li = 0;
		int hi = (s1 + s2 + s3).length() - 1;
		int len = (s1 + s2 + s3).length();
		
		System.out.println(10+20);
		System.out.println(10+"hello");
		System.out.println("hello"+20);
		System.out.println(1+2/2);
		System.out.println(s1+10*20+s2+s3);
		System.out.println(s1+s2+s3+(10-5));
	}
}
