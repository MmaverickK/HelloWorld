package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstrWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
	}

	public static int lengthOfLongestSubstring(String s) {

		int lengthOfLongestSubstring = 0;
		for (int i = 0; i < s.length(); i++) {
			Set<Character> visited = new HashSet<Character>();
			int tempLength = 0;
			for (int j = i; j < s.length(); j++) {
				if (!visited.contains(s.charAt(j))) {
					visited.add(s.charAt(j));
					tempLength++;
					if (tempLength > lengthOfLongestSubstring) {
						lengthOfLongestSubstring = tempLength;
					}
				} else {
					
					break;

				}
			}
		}

		return lengthOfLongestSubstring;

	}

}
