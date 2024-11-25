package code;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String args[]) {
		String[] strs = { "flower", "flow", "flight", "fly" };
		System.out.println(longestCommonPrefix(strs));
	}

	private static String longestCommonPrefix(String[] strs) {
		String initializer = strs.length > 0 ? strs[0] : "";
		return Arrays.stream(strs).reduce(initializer,
				(String previousString, String currentString) -> findCommonPrefix(previousString, currentString));
	}

	private static String findCommonPrefix(String previousString, String currentString) {
		String prefix = "";
		int n = Math.min(previousString.length(), currentString.length());
		for (int i = 0; i < n; i++) {
			if (previousString.charAt(i) == currentString.charAt(i)) {
				prefix += previousString.charAt(i);
			} else {
				break;
			}
		}
		return prefix;
	}
}
