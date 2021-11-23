package StringConcept;

/**
 * String is a class in java and not a data type
 * String is immutable means once string object get created then cannot be modify or update.if we try to update then a new string object get created
 * java developer created string as a class and not a data type because in many application string variables are used. Java developer provides string class
 * with predefined methods so that user can used them and perform operation.User doesnt need to create userdefined methods which saved time and cost
 *  two ways to create string :direct declaring and intializing string and by using new keyword
 * @author Dell
 *
 */
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
