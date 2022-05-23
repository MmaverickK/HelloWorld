package striver.sdesheet.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	
	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	
	public static int findDuplicate(int[] nums) {
//		int ans = 0;
//		Set<Integer> visited = new HashSet<Integer>();
//		for(int i=0; i<nums.length; i++) {
//			if(!visited.contains(nums[i])) {
//				visited.add(nums[i]);
//			}else {
//				ans = nums[i];
//				break;
//			}
//		}
//		return ans;
		//1,3,4,2,2
		if (nums.length > 1)
		{
			int slow = nums[0];
			int fast = nums[nums[0]];
			while (slow != fast){
				slow = nums[slow];
				fast = nums[nums[fast]];
			}

			fast = 0;
			while (fast != slow)
			{
				fast = nums[fast];
				slow = nums[slow];
			}
			return slow;
		}
		return -1;
	}

}
