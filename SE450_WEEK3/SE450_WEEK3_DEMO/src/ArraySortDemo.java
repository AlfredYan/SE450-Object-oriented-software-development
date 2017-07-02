import java.util.Arrays;

/***
 * Array sort demo
 * @author KYAN4
 *
 */

public class ArraySortDemo {
	public static void main(String[] args) {
		Integer[] ints = new Integer[10];
		Integer value = 10;
		for(int i = 0; i < ints.length; i++) {
			ints[i] = (int)(Math.random() * 10) + 10;
			System.out.println(ints[i]);
		}
		
		System.out.println("\nSorting...");
		
		// the second parameter defines how to sort, it's a comparator
		Arrays.sort(ints, (i1, i2) -> i1 - i2);
		
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
	}
}
