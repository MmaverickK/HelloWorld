package leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_26 {

	public static void main(String[] args) {
		int[] arr = {1,1,2};
		System.out.println(removeDuplicates(arr));
	}

	public static int removeDuplicates(int[] nums) {
		Set<Integer> found = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(!found.contains(nums[i])) {
				found.add(nums[i]);
			}
		}
		return found.size();
	}

}
