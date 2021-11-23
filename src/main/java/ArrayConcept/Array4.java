package ArrayConcept;

public class Array4 {

	public static void main(String[] args) {

//		int array1[]= {1,2,3,4,5};
//		int array2[]= {11,12,13,14,15};

		Array4 obj = new Array4();

		int a[] = obj.addArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int a1[]= {1,2};
		int a2[]= {1,2};
		
		int a3[] = new int[2];
		
		for (int i = 0; i < a2.length; i++) {
			a3[i]=a1[i]+a2[i];
		}
		

	}

	public int[] addArray() {
		// int array1[]=new int[5];
		// int array2[]=new int[5];

		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 11, 12, 13, 14, 15 };

		int len = array1.length;
		int array3[] = new int[len];

		for (int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] + array2[i];
		}

		return array3;
	}
}
