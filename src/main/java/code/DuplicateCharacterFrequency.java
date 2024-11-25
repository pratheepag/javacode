package code;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateCharacterFrequency {
	public static void main(String args[]) {
		String str = "Hello";
		Predicate<Map.Entry<String, Long>> predicate = charData -> charData.getValue() > 1;
		str.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(charcter -> predicate.test(charcter)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).forEach((key, value) -> System.out.println(key + " " + value));
	}
}
