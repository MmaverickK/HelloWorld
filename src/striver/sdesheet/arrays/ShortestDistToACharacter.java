package striver.sdesheet.arrays;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistToACharacter {

	public static void main(String[] args) {
		shortestToChar("loveleetcode", 'e');
	}
	//[3,5,6,11]
	public static int[] shortestToChar(String s, char c) {
		int[] ans = new int[s.length()];
//		List<Integer> indexes = new ArrayList<Integer>();
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i)==c) {
//				indexes.add(i);
//			}
//		}
		
		for(int i=0; i<s.length(); i++) {
			ans[i] = findNearestChar(s, i, c);
		}
		return ans;
	}
	private static int findNearestChar(String s, int i, char c) {
		int nearestAt = 0;
		int checkLeft = checkLeft(s, i, c);
		int checkRight = checkRight(s, i, c);
		if(checkLeft == -1 && checkRight != -1) {
			nearestAt =  checkRight;
		}else if(checkLeft != -1 && checkRight == -1){
			nearestAt =  checkLeft;
		}else {
			if(checkLeft <= checkRight) {
				nearestAt = checkLeft;
			}else {
				nearestAt = checkRight;
			}
		}
		return nearestAt;
	}
	private static int checkRight(String s, int i, char c) {
		int found = -1;
		for(int j=i+1; j<s.length(); j++) {
			if(s.charAt(j) == c) {
				found =  Math.abs(i-j);
				break;
			}else {
				continue;
			}
		}
		return found;
	}
	private static int checkLeft(String s, int i, char c) {
		int found = -1;
		for(int j=i; j>=0; j--) {
			if(s.charAt(j) == c) {
				found =  Math.abs(i-j);
				break;
			}else {
				continue;
			}
		}
		return found;
	}
	
}
