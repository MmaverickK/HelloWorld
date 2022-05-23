package leetcode.medium.hashtable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomSortString {
	
	public static void main(String[] args) {
		System.out.println(customSortString("kqep", "pekeq"));
	}

	public static String customSortString(String order, String s) {
		char[] sb1 = new char[s.length()];
		
		Map<Character, Integer> rankMap = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<order.length(); i++) {
			rankMap.put(order.charAt(i),i );
		}
		int counter = -1;
		for(int i=0; i<s.length(); i++) {
			if(rankMap.containsKey(s.charAt(i))) {
				Integer rank = rankMap.get(s.charAt(i));
				if(sb1[rank] == s.charAt(i)) {
					while(sb1[rank++] == s.charAt(i)) {
//						if()
						sb1[rank] = s.charAt(i);
						counter++;
					}
				}else {
					sb1[rank] = s.charAt(i);
					counter++;
				}
				
				
			}
			
			else {
				sb1[++counter] = s.charAt(i);
				
			}
		}
		return new String(sb1);
		
	}

}
