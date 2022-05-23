package leetcode.easy.array;


// https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutive1s {

	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));;
	}
	
	
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int  count = 0, maxCount = 0;
		for(int i=0; i<nums.length-1; i++) {
        	if(nums[i]==nums[i+1] && nums[i]==1) {
        		count++;
        	}else {
        		count = 0;
        	}
        	if(count > maxCount) {
        		maxCount = count;
        	}
        }
		
		return maxCount+1;
    }
	
}
