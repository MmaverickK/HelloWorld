package leetcode.easy.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DegreeOfAnArray {

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,1};
		Date startDate = new Date();
				

		System.out.println(leetCodeSolytion(nums));
		Date endDate   = new Date();

		long duration  = endDate.getTime() - startDate.getTime();

		long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		System.out.println("time: "+diffInSeconds);
	}

	private static int findShortestSubArray(int[] nums) {
		int overallDegree = findDegree(nums);
		if(nums.length == 1) {
			return 1;
		}
		int minLength = Integer.MAX_VALUE;
		for(int i=0; i<nums.length; i++) {
			for(int j=i; j<nums.length; j++) {
				int[] subArr = Arrays.copyOfRange(nums, i, j+1);
				if(findDegree(subArr) == overallDegree && minLength > subArr.length) {
					minLength = subArr.length;
				}
			}
		}
		
		return minLength;
	}
	
	private static int findDegree(int[] arr){
		int degree = 0;
		Map<Integer, Integer> freqencyMap = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(freqencyMap.containsKey(arr[i])) {
				freqencyMap.put(arr[i], freqencyMap.get(arr[i])+1);
			}else {
				freqencyMap.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : freqencyMap.entrySet()) {
			if(entry.getValue() > degree) {
				degree = entry.getValue();
			}
		}
		
//		List<Map.Entry<Integer, Integer> > list
//        = new LinkedList<Map.Entry<Integer, Integer> >(
//            freqencyMap.entrySet());
//
//    // Sort the list using lambda expression
//    Collections.sort(
//        list,
//        (i1,
//         i2) -> i2.getValue().compareTo(i1.getValue()));
//    
//    return list.get(0).getValue();
		
		return degree;
	}
	
	private static int leetCodeSolytion(int[] nums) {
		Map<Integer, Integer> numToFreq = new HashMap<Integer, Integer>();
	    Map<Integer, Integer> numToFirst = new HashMap<Integer, Integer>();

	    int freq = 0, result = 0;
	    for(int i = 0; i < nums.length; i++) {
	        if( !numToFreq.containsKey(nums[i]) ) {
	            numToFreq.put(nums[i], 1);
	            numToFirst.put(nums[i], i);
	            if( freq == 0 ) {
	                freq = 1;
	                result = 1;
	            }
	        }
	        else {
	            int newFreq = numToFreq.get(nums[i]) + 1;
	            numToFreq.put(nums[i], newFreq);        
	            if( newFreq > freq ) {
	                freq = newFreq;
	                result = i - numToFirst.get(nums[i]) + 1;
	            }
	            else if( newFreq == freq ) {
	                result = Math.min(result, i - numToFirst.get(nums[i]) + 1);
	            }
	        }
	    }

	    return result;
	}

}
