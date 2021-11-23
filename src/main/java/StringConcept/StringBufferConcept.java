package StringConcept;

public class StringBufferConcept {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Rahul");
		System.out.println(sb);
		System.out.println(sb.hashCode());

		sb.append("Arora");
		System.out.println(sb);
		System.out.println(sb.hashCode());

		System.out.println(sb.capacity());// old capacity*2+2

		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.capacity());
		sb2.append("1234567890123");
		System.out.println(sb2);

		System.out.println(sb2.length());
		System.out.println(sb2.charAt(1));
		System.out.println(sb2.delete(1, 2));
		System.out.println(sb2.deleteCharAt(0));

		System.out.println(sb.equals(sb2));

		System.out.println("-----------");

		StringBuffer sb3 = new StringBuffer("Deepak");
		StringBuffer sb4 = new StringBuffer("Deepak");

		System.out.println(sb3.equals("sb4"));

		sb4 = sb3.append("Sharma");
		System.out.println(sb3.equals(sb4));

		System.out.println(sb3.indexOf("e"));
		System.out.println(sb3.lastIndexOf("e"));
		System.out.println(sb3.insert(2, "d"));
		System.out.println(sb3);
		System.out.println(sb3.replace(1, 3, "d"));
		System.out.println(sb3.reverse());
		System.out.println(sb3);
		System.out.println(sb3.subSequence(2, 5));
		System.out.println(sb3.substring(2));
		System.out.println(sb3);

		StringBuffer sb9 = new StringBuffer();
		String s7 = sb9.toString();
	}
}
