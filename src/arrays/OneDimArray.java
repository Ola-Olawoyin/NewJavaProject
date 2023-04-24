package arrays;

public class OneDimArray {

	public static void main(String[] args) {
		
		/*
		 * Arrays:
		 * Arrays are objects that holds a collection of similar datatype
		 * Once the length of an array is declared it becomes static and cannot
		 * be changed. This is because the length of an array is a final variable
		 * which once declared cannot be changed
		 * The elements of an array are counted as indexes, and the first
		 * index is 0 and the last is array length -1.
		 * 
		 */
		
		int[] array = new int[5];
		array[0] = 1;//The array must store only values with declared datatype
		array[1] = 2;
		array[4] = 1;
	
		/*
		 * Unassigned array values take the default value of the datatype
		 * That is 0 for int, 0.0 for double, null for String etc 
		 */
		for(int index=0; index<array.length;index++) {
			System.out.println(array[index]);
		}

	}

}
