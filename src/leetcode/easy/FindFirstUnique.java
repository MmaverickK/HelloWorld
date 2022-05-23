package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindFirstUnique {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}

	public static int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			map.put(s.charAt(i),1+map.getOrDefault(s.charAt(i), 0));
		}
		
		for(int i=0; i<s.length(); i++) {
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		return -1;
	}

}
