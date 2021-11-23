
public class StringConcept {

	public static void main(String[] args) {

		String s1 = "Rahul";
		String s2 = "Rahul";

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		s1 = "Rahule Arora";
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
