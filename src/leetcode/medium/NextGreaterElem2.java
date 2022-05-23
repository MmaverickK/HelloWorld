package leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//   https://leetcode.com/problems/next-greater-element-ii/

public class NextGreaterElem2 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 3 };
		int[] nextGreaterElements = nextGreaterElements(nums);
		System.out.println("done!!");
	}

// My Solution	
//	public static int[] nextGreaterElements(int[] nums) {
//		int[] ans = new int[nums.length];
//		Stack<Integer> stk = new Stack<Integer>();
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		
//		for(int i=0; i<nums.length; i++) {
//			ans[i] = findNextGreater(i, nums[i], nums);
//		}
//		
//		
//		return ans;
//	}
//
//	private static int findNextGreater(int index, int num, int[] nums) {
//		for(int i= index+1; i<nums.length; i++) {
//			if(nums[i] > num) {
//				return nums[i];
//			}
//		}
//		for(int i=0; i<=index-1; i++) {
//			if(nums[i] > num) {
//				return nums[i];
//			}
//		}
//		return -1;
//	}

	// Discuss Solution
	public static int[] nextGreaterElements(int[] nums) {

		Stack<Integer> stack = new Stack<>();
		for (int i = nums.length - 1; i >= 0; i--) {
			stack.push(nums[i]);
		}

		int greater[] = new int[nums.length];
		for (int i = nums.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= nums[i]) {
				stack.pop();
			}
			greater[i] = stack.empty() ? -1 : stack.peek();
			stack.push(nums[i]);
		}

		return greater;
	}

}
