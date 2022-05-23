package leetcode.easy.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//  https://leetcode.com/problems/buddy-strings
public class BuddyString {

	public static void main(String[] args) {
		System.out.println(buddyStrings("ab", "ab"));
	}

	public static boolean buddyStrings(String s, String goal) {
		if(s.length() != goal.length()) {
			return false;
		}
		
		Map<Character, Character> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != goal.charAt(i)) {
				if(!map.containsKey(s.charAt(i))){
					map.put(s.charAt(i), goal.charAt(i));
				}
				
			}
		}
		
		if(map.entrySet().size() == 0) {
			return true;
		}
		else if(map.entrySet().size() != 2) {
			return false;
		}else {
			Character firstKey = null, firstValue = null, secondKey = null, secondValue = null;
			for(Map.Entry<Character, Character> entry : map.entrySet()) {
				if(firstKey == null) {
					firstKey= entry.getKey();
					firstValue= entry.getValue();
				}else {
					secondKey= entry.getKey();
					secondValue= entry.getValue();
				}
				
			}
			return (firstKey.equals(secondValue) && firstValue.equals(secondKey));
		}
		
		
		
	}

}
