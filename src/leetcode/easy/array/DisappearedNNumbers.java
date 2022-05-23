package leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//   https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class DisappearedNNumbers {
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums);
		System.out.println("done");
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> ans = new ArrayList<Integer>();
		Set<Integer> present = new HashSet<Integer>();
		for (int i=0; i<nums.length; i++) {
			present.add(nums[i]);
		}
		
		for(int i=0; i<nums.length; i++) {
			if(!present.contains(i+1)) {
				ans.add(i+1);
			}
		}
		
		return ans;
		
	}
}
