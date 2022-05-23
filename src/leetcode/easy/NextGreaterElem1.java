package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElem1 {
	
	public static void main(String[] args) {
		int nums1[] = {1, 2, 3};
		int nums2[] = {2, 1, 4, 3};
		int[] ans = nextGreaterElement(nums1, nums2);
		System.out.println("done");
	}
	
	
	
//	My Solution
//	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] ans = new int[nums1.length];
//        for(int i=0; i<nums1.length; i++){
//            ans[i] = findNextGreater(nums1[i], nums2);
//        }
//        return ans;
//    }
//    
//    private static int findNextGreater(int num, int[] nums2){
//        for(int i=0; i<nums2.length; i++){
//            if(nums2[i]==num){
//                for(int j=i+1; j<nums2.length; j++){
//                    if(nums2[j] > num){
//                        return nums2[j];
//                    }
//                }
//                return -1;
//            }
//        }
//        return -1;
//    }
	
	// Solution from Discuss
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums2){            
            while(!stack.isEmpty() && num > stack.peek())
                map.put(stack.pop(), num);
            stack.push(num);            
        }
        
        int i=0;        
        for(int num : nums1)
            result[i++] = map.getOrDefault(num, -1);
        return result;
    }
	

}
