package ArrayConcept;

public class Array3 {

	/**
	 * create an array of type Array3 class need an object of class Array3 assign
	 * object to index 0 of array of type Array3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Array3 array[] = new Array3[5];

		Array3 obj1 = new Array3();

		array[0] = obj1;

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}
	}
}
