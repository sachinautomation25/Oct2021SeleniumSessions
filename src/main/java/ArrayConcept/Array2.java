package ArrayConcept;

public class Array2 {

	public static void main(String[] args) {
		
		int array[]=new int[10];
		for (int i = 0; i < 5; i++) {
			array[i]=(int) (Math.random()*1000);
		}
		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
