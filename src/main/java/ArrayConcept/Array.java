package ArrayConcept;

public class Array {

	public static void main(String[] args) {

		int array[] = new int[5];
		// insert values in an array
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		int array3[]= {1,2};
		System.out.println(array3.length);

		// insert value in an array index that doesn't exist
		//at compile time there will be no error because syntax wise it is correct but jvm will throw exception at run time

		// array[5]=60;//java.lang.ArrayIndexOutOfBoundsException:

		// fetch values from an array
		System.out.println(array[0]);
		
		//length of an array
		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int array2[] = new int[5];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i;
			System.out.println(array2[i]);
		}

	}

}
