package leetcode.medium.array;

import java.util.LinkedList;
import java.util.List;

public class IncreasingSubsequence {
	
	public static void main(String[] args) {
		int[] arr = {4,6,7,7};
		List<List<Integer>> findSubsequences = findSubsequences(arr);
		System.out.println("end ::"+ findSubsequences);
	}
	
	public static List<List<Integer>> findSubsequences(int[] nums) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		for(int i=0; i<nums.length-1; i++) {
			List<Integer> list = new LinkedList<Integer>();
			list.add(nums[i]);
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j] >= list.get(list.size()-1)) {
					list.add(nums[j]);
					List<Integer> newList = new LinkedList<Integer>(list);
					res.add(newList);
				}
			}
			res.add(list);
			
		}
		return res;
	}

}
