import java.util.HashSet;

public class UniqueString {

	public static void main(String[] args) {
		
		String ar[]= {"first","second","third","first","second"};
		
		HashSet hs=new HashSet();
		for (int i = 0; i < ar.length; i++) {
			hs.add(ar[i]);
		}
		System.out.println(hs);
	}
}
