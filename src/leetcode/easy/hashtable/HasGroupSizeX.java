package leetcode.easy.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//  https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
public class HasGroupSizeX {

	public static void main(String[] args) {
		int[] deck = {1,1,2,2,2,2};
		System.out.println(hasGroupsSizeX(deck));
	}
//   My Incorrect Solution
//	public static boolean hasGroupsSizeX(int[] deck) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(int i=0; i<deck.length; i++) {
//			if(map.containsKey(deck[i])) {
//				Integer prevFreq = map.get(deck[i]);
//				map.put(deck[i], prevFreq+1);
//			}else {
//				map.put(deck[i], 1);
//			}
//		}
//		
//		int freq = 0, currentFreq = 0;
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			currentFreq = entry.getValue();
//			if(freq == 0) {
//				freq = currentFreq;
//			}
//			
//			if(freq != 0 && currentFreq != freq) {
//				return false;
//			}
//			
//		}
//		
//		return true;
//	}
	 //Correct Leetcode solution
	 public static boolean hasGroupsSizeX(int[] deck) {
	        if (deck.length < 2) return false;
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i : deck) {
	            map.put(i, 1 + map.getOrDefault(i, 0));
	        }

	        // Find frequency of each number
	        List<Integer> list = new ArrayList<>(map.values());
	        int X = list.get(0);
	        for(int i:list) X = Math.min(i,X);
	        
	        // Find whether they can be divided by the same number
	        for (int i = 2; i <= X; i++) {
	            if (allDivi(list, i)) return true;
	        }
	        return false;
	    }

    private static boolean allDivi(List<Integer> list, int i) {
        for (int a : list) {
            if (a % i != 0) return false;
        }
        return true;
    }

}
