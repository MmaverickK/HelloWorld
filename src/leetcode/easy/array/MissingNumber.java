package leetcode.easy.array;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] nums = {3,0,1};
		
		System.out.println(missingNumber(nums));
		
	}
	
	public static int missingNumber(int[] nums) {
		int size = nums.length;
		int expectedSum = (size)*(size+1)/2;
		int actualSum = 0;
		for (int i=0; i<nums.length; i++) {
			actualSum += nums[i];
		}
		return expectedSum-actualSum;
	}

}
