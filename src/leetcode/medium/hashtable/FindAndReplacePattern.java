package leetcode.medium.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//  https://leetcode.com/problems/find-and-replace-pattern/
public class FindAndReplacePattern {

	public static void main(String[] args) {
		String[] words ={"badc","abab","dddd","dede","yyxx"};
		String pattern = "baba";
		List<String> findAndReplacePattern = findAndReplacePattern(words,pattern);
		System.out.println("done");
	}

	public static List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> ans = new ArrayList<String>();
		Map<Character, List<Integer>> patternMap = new LinkedHashMap<Character, List<Integer>>();
		buildMap(pattern, patternMap);
		for(int i=0; i<words.length; i++) {
			Map<Character, List<Integer>> map = new LinkedHashMap<Character, List<Integer>>();
			buildMap(words[i], map);
			if(validateMap(patternMap, map)) {
				ans.add(words[i]);
			}
		}
		
		return ans;
	}

	private static boolean validateMap(Map<Character, List<Integer>> patternMap, Map<Character, List<Integer>> map) {
		if(patternMap.size() != map.size()) return false;
//		Map<Character, Character> mappedCharaters = new HashMap<Character, Character>();
		int i=0;
		for(Map.Entry<Character, List<Integer>> entry : patternMap.entrySet()) {
			
			
			int j=0;
			for(Map.Entry<Character, List<Integer>> entry2 : map.entrySet()) {
				if(i==j) {
					if(!isBothListEqual(entry.getValue(), entry2.getValue())) {
						return false;
					}
				}
				j++;
			}
			i++;	
			
//			if(map.get(key) == null || map.get(key) != value) return false;
			
		}
		return true;
		
	}

	

	private static boolean isBothListEqual(List<Integer> list1, List<Integer> list2) {
		if(list1.size() != list2.size()) return false;
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i) != list2.get(i)) {
				return false;
			}
		}
		return true;
	}

	private static void buildMap(String str, Map<Character, List<Integer>> map) {
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				List<Integer> list = map.get(str.charAt(i));
				list.add(i);
				map.put(str.charAt(i), list);
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(str.charAt(i), list);
				
			}
		}
		
	}

}
