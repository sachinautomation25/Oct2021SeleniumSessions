package StringConcept;

/**
 * stringbuffer and string builder both have same methods/api methods in
 * stringbuffer are synchrnized hence, thread safe methods in stringbuilder are
 * non synchronized hence, are not thread safe string builder is fastet,
 * performnace is high
 * 
 * @author Dell
 *
 */
public class StringBuilderConcept {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Rahul");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Arora Java");
		System.out.println(sb.capacity());
		sb.append("Tr");
		System.out.println(sb.capacity());

		System.out.println("-----------");
		// System.out.println(sb.reverse());
		System.out.println(sb);

		System.out.println(sb.length());
		System.out.println(sb.hashCode());

		// System.out.println(sb.ensureCapacity(20));

		System.out.println(sb.substring(2));

		System.out.println(sb);

		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb);

		System.out.println(sb.substring(1));
		System.out.println(sb);
		System.out.println(sb.substring(1, 3));
	}
}
