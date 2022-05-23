package leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 *
 */

public class IntersectionOf2Arrays {
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		int[] ans = intersect(nums1, nums2);
		System.out.println(ans);
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		boolean isNums1Large = nums1.length >= nums2.length ? true : false;
		List<Integer> ans = new ArrayList<Integer>();
		Map<Integer, Integer> lookUpMap = null;
		if(isNums1Large) {
			lookUpMap = prepareFrequencyMap(nums2);
			ans = findIntersection(nums1, lookUpMap);
		}else {
			lookUpMap = prepareFrequencyMap(nums1);
			ans = findIntersection(nums2, lookUpMap);
		}
		return ans.stream().mapToInt(i->i).toArray();
	}

	private static Map<Integer, Integer> prepareFrequencyMap(int[] nums) {
		Map<Integer, Integer> lookUpMap = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			if(lookUpMap.containsKey(nums[i])) {
				Integer preValue = lookUpMap.get(nums[i]);
				lookUpMap.put(nums[i], preValue + 1);
			}else {
				lookUpMap.put(nums[i], 1);
			}
		}
		return lookUpMap;
	}

	private static List<Integer> findIntersection(int[] largeArr, Map<Integer, Integer> lookUpMap) {
		List<Integer> ans = new ArrayList<Integer>();
		for(int i=0; i<largeArr.length; i++) {
			if(lookUpMap.containsKey(largeArr[i]) && lookUpMap.get(largeArr[i]) > 0) {
				Integer prevValue = lookUpMap.get(largeArr[i]);
				lookUpMap.put(largeArr[i], prevValue-1);
				ans.add(largeArr[i]);
			}
		}
		
		return ans;
	}

}
