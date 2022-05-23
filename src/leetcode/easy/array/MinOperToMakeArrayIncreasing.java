package leetcode.easy.array;

/*https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
 * 
*/
public class MinOperToMakeArrayIncreasing {

	public static void main(String[] args) {
		int[] nums = {1,5,2,4,1};
		System.out.println(minOperations(nums));
	}

	public static int minOperations(int[] nums) {
		int minOperCount = 0;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] < nums[i+1]) {
				continue;
			}else {
				minOperCount += (nums[i]-nums[i+1]) + 1;
				nums[i+1] += (nums[i]-nums[i+1]) + 1;
			}
		}
		return minOperCount;
	}

}
