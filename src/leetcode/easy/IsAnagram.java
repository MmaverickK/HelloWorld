package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsAnagram {
	public static void main(String[] args) {
		
	}
	
	 public boolean isAnagram(String s, String t) {
	        if(s.length() != t.length()){
	            return false;
	        }
	        
	        Map<Character, Integer> mapS = new HashMap<>();
	        Map<Character, Integer> mapT = new HashMap<>();
	        Set<Character> setS = new HashSet<>();
	        Set<Character> setT = new HashSet<>();
	        
	        for(int i=0; i<s.length(); i++){
	            setS.add(t.charAt(i));
	            mapS.put(s.charAt(i), 1+mapS.getOrDefault(s.charAt(i), 0));
	        }
	        
	        for(int i=0; i<t.length(); i++){
	            setT.add(t.charAt(i));
	            mapT.put(t.charAt(i), 1+mapT.getOrDefault(t.charAt(i), 0));
	        }
	        
	        if(setS.size() != setT.size()) return false;
	        
	        for(Character c : setT){
	            if(mapS.get(c) != mapT.get(c)){
	                return false;
	            }
	        }
	        return true;
	        
	        
	    }
	
	
	
}
