package arrays;

import java.lang.reflect.Array;

public class MultiDimArray {

	public static void main(String[] args) {
		/*MultiDim Array
		 * 2 dim array: data_type [][] array_name = new datatype[x][y]
		 * 3 dim array: data_type [][][] array_name = new datatype[x][y][z]
		 * To print the length of the arrays:
		 * array_name.length would print the length of the x array
		 * array_name[an index in x array].length would print the length of y array
		 * array_name[an index in x array][an index in y array].length would 
		 * print the length of z array
		 * The arrays are not rows by column but arrays of arrays
		 * Multi-Dim arrays are 1 Dim array within each index of a 1 Dim array
		 */
		
		int[][][] array = new int[3][4][5];
		for(int i=0; i<array.length; i++) {
			

			for(int j=0; j<array[i].length; j++) {
				

				for(int k=0; k<array[i][j].length; k++) {
					
					array[i][j][k] = (int)(Math.random()*1000);
					
					System.out.print(array[i][j][k]+" ");
					
				}
				
				System.out.println();

			}
			
			System.out.println();

		}

	}

}
