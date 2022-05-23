package leetcode.medium.string;

/*Given a string s, return the longest palindromic substring in s.

		 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.*/

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("ab"));
	}
	
	public static String longestPalindrome(String s) {
		String maxPalindrome = "";
		if(s.length() == 1) {
			maxPalindrome = s;
		}
		for(int i=0; i<s.length()-1; i++) {
			if(maxPalindrome.length() == 0) {
				maxPalindrome = Character.toString(s.charAt(i));
			}
			for(int j=i+1; j<s.length(); j++) {
				if(isPalindrome(s.substring(i, j+1)) && s.substring(i, j+1).length() > maxPalindrome.length()) {
					maxPalindrome = s.substring(i, j+1);
				}
			}
		}
		return maxPalindrome;
	}

	private static boolean isPalindrome(String substr) {
		for (int i = 0; i < substr.length() / 2; i++) {
			if (substr.charAt(i) != substr.charAt(substr.length() - i-1)) {
				return false;
			}
		}
		return true;
	}
}
