package code;

import java.util.Arrays;
import java.util.Collections;

public class ReverseIntegerList {
	public static void main(String args[]) {
		int[] numbers = { 1, 2, 7, 4, 5, 6, 7, 8, 9 };
		
		Collections.reverse(Arrays.asList(numbers));
		System.out.println(Arrays.toString(numbers));
	}
}
