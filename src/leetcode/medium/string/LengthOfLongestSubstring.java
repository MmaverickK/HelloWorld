package leetcode.medium.string;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

*/

public class LengthOfLongestSubstring {
		
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	
	 public static int lengthOfLongestSubstring(String s) {
		 int maxLength = 0;
		 for(int i=0; i<s.length(); i++) {
			 Set<Character> visited = new HashSet<Character>();
			 int tempLength = 0;
			 for(int j=i; j<s.length(); j++) {
				if(!visited.contains(s.charAt(j))) {
					visited.add(s.charAt(j));
					tempLength++;
					if(tempLength > maxLength) {
						maxLength = tempLength;
					}
				}else {
					if(tempLength > maxLength) {
						maxLength = tempLength;
					}
					break;
					
				}
			 } 
		 }
		 
	     return maxLength;
	 }
}
