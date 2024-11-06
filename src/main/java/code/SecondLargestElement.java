package code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SecondLargestElement {
    public static void main(String[] args) {
	    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	    int secondLargest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	    System.out.println(secondLargest);
	    int min = IntStream.of(numbers).min().getAsInt();
	}
}
