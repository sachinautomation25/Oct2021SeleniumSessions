package ArrayConcept;

public class TwoDArray {

	public static void main(String[] args) {


		int array[][]=new int[2][3];
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=(int)( Math.random()*1000);
				System.out.println(array[i][j]);
			}
		}
		System.out.println("-----------");
		int array2[][]=new int[2][];
		
		array2[0]=new int[3];
		array2[1]=new int[5];
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j]=(int) (Math.random()*1000);
				System.out.println("i--> "+i+" j-->"+j +" "+array2[i][j]);
			}
		}
	}

}
