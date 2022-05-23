package leetcode.medium.hashtable;

import java.util.HashMap;
import java.util.Map;


//  https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram-ii
public class MinNoOfStepsToMakeTwoStrAnagram {
	
	public static void main(String[] args) {
		System.out.println(minSteps("leetcode", "coats"));
	}
	
    public static int minSteps(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
             mapS.put(s.charAt(i) , 1 + mapS.getOrDefault(s.charAt(i), 0));
        }
        
        for(int i=0; i<t.length(); i++){
             mapT.put(t.charAt(i), 1 + mapT.getOrDefault(t.charAt(i), 0));
        }
        
        if(mapS.size() > mapT.size()){
            return compareMaps(mapS, mapT);
        }else{
            return compareMaps(mapT, mapS);
        }
        
        
        
    }
    
    private static int compareMaps(Map<Character, Integer> bigMap, Map<Character, Integer> smallMap){
    	int count = 0;
        for(Map.Entry<Character, Integer> entry : bigMap.entrySet()){
           Character key = entry.getKey(); 
           Integer value1 = entry.getValue();
           Integer value2 = smallMap.get(key);
		if(value2 == null) {
        	   count += value1;
           }else {
        	   smallMap.get(key);
        	   count += Math.abs(value1 - value2);
        	   smallMap.put(key, value2);
           }
        }
        
        for(Map.Entry<Character, Integer> entry : smallMap.entrySet()) {
        	Character key = entry.getKey();
        	Integer value2 = entry.getValue();
        	Integer value1 = bigMap.get(key);
        	if(value1 == null) {
        		count += value2;
        	}
        	
        	
        }
        
        return count;
    }

	
}
