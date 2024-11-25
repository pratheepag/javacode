package code;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String str = "Hello";
		str.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(charcter -> charcter.getValue() > 1).map(charcterFrequency -> charcterFrequency.getKey()).forEach(System.out::println);
	}
}
