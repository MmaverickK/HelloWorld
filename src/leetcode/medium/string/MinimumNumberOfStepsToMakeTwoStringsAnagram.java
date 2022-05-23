package leetcode.medium.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
	
	public static void main(String[] args) {
		System.out.println(minSteps("leetcode", "practice"));
	}
	//[c, d, e, e, e, l, o, t]    
	//[a, c, c, e, i, p, r, t]
	public static int minSteps(String s, String t) {
//		char[] s1 = s.toCharArray();
//        Arrays.sort(s1);
//        
//        char[] t1 = t.toCharArray();
//        Arrays.sort(t1);
//        int step = 0;
//        
//		for(int i=0; i<t1.length; i++) {
//			if(s1[i] != t1[i]) {
//				step++;
//			}
//				
//		}
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			if(charCountMap.containsKey(s.charAt(i))) {
				charCountMap.put(s.charAt(i), charCountMap.get(s.charAt(i))+1);
			}else {
				charCountMap.put(s.charAt(i), 1);
			}
		}
		int step = 0;
		for(int i=0; i<t.length(); i++) {
			if(charCountMap.containsKey(t.charAt(i)) && charCountMap.get(t.charAt(i)) > 0) {
				charCountMap.put(t.charAt(i), charCountMap.get(t.charAt(i))-1);
			}else {
				step++;
			}
		}
		
		return step;
	}

}
