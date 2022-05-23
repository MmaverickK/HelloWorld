package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;


public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		
		Arrays.sort(nums);
		List<List<Integer>> threeSum = threeSum(nums);
		System.out.println("done");
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int a = -(nums[i] + nums[j]);
				int k = IntStream.range(0, nums.length)
								.filter(p -> nums[p] == a)
								.findFirst()
								.orElse(-1);

				if (k != -1 && i != k && i!=j && j != k & j!=i) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					Collections.sort(list);
					if(!set.contains(list)) {
						set.add(list);
						ans.add(list);
						break;
					}
					
				}
			}
		}
		return ans;
	}

}
