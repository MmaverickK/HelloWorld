package leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

//  https://leetcode.com/problems/two-sum/

class TwoSum {
	
	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int[] ans = twoSum(nums, 9);
		System.out.println("Done!");
	}
	
    public static int[] twoSum(int[] nums, int target) {
        // int[] ans;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            // for(int j=i+1; j<nums.length; j++){
            //     if(nums[i]+nums[j] == target){
            //         ans[0] = i;
            //         ans[1] = j;
            //         break;
            //     }
            // }
            
//            Integer diff = (Integer)(target-nums[i]);
//            if(map.containsKey(diff)){
//                int[] ans = {map.get(diff),i};
//                return ans;
//            }
//            map.put(diff, i);
        	
        	 Integer diff = (Integer)(target - nums[i]);
             if(map.containsKey(diff)){
                 int toReturn[] = {map.get(diff)+1, i+1};
                 return toReturn;
             }

             map.put(nums[i], i);
            
            
        }
        return null;
    }
}