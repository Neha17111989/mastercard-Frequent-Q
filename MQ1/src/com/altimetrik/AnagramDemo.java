package com.altimetrik;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		if (isAnagram("peek", "reep")) {
			System.out.println("YES");
		} else {
			System.out.println("false");
		}

	}

	private static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				return true;
			} else {
				return false;
			}
		}
		// return true;

	}

}
