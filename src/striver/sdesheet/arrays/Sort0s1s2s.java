package striver.sdesheet.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort0s1s2s {
	
	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		doJob(arr);
		
	}

	private static int[] doJob(int[] arr) {
		
		int[] ans = new int[arr.length];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		LinkedHashMap<Integer, Integer> collect = map.entrySet().stream()
				.sorted(Map.Entry.<Integer, Integer>comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		int i = 0;
		for (Map.Entry<Integer, Integer> e : collect.entrySet()) {
			for (int j = 0; j < e.getValue(); j++, i++) {
				ans[i] = e.getKey();

			}
		}
		arr = ans;
		return ans;
		
		/*leetcode sol
		 * int p1 = 0, p2 = nums.length - 1, index = 0; while (index <= p2) { if
		 * (nums[index] == 0) { nums[index] = nums[p1]; nums[p1] = 0; p1++; } if
		 * (nums[index] == 2) { nums[index] = nums[p2]; nums[p2] = 2; p2--; index--; }
		 * index++; } return nums;
		 */
	}
}
