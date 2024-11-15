package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterCount {
	public static void main(String[] args) {
		/*String str = "Hello";
		List<String> list = Arrays.asList(str.split(""));
		Map<String, Long> map = list.stream()
				.filter(charData -> Collections.frequency(list, charData) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map); */
		
		//Duplicate words in list
		List<String> list = Arrays.asList("Hello", "World", "Hello", "Java", "Hello");
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		
	}
}
