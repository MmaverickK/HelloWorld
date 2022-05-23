package leetcode.hard.array;

import java.util.Arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] nums = {0,2,2,1,1};
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {
		int checkWith = 1;
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > 0) {
				if(nums[i] == checkWith) {
					continue;
				}else if(nums[i] > checkWith && nums[i] == (checkWith +1)){
					checkWith = checkWith +1;
				}
				
			}
		}
		return checkWith;
	}

}
