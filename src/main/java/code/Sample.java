package code;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String args[]) throws URISyntaxException, IOException {
		String str = "Hello";
		List<String> stringElement = Arrays.asList("a", "e", "i", "o", "u");
		List<String> vowels = new ArrayList<>(stringElement);
		Map<String, Long> map2 =str.chars().mapToObj(c -> String.valueOf((char)c)).filter(word -> vowels.contains(word)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//Map<String, Long> map = Arrays.asList(words).stream().filter(word -> vowels.contains(word)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map2.entrySet().forEach(System.out::println);
		//Arrays.stream().filter(vowels::contains).forEach(System.out::println);)
		
		Path path1 = Paths.get(Sample.class.getResource("sample.txt").toURI());
		Files.lines(path1).forEach(System.out::println);
		
		URL url = Sample.class.getResource("sample.txt");
		Path path = Paths.get(url.toURI());
		Files.lines(path).forEach(System.out::println);
	}
}
