package leetcode.easy.array;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int index = search(nums, 9);
		System.out.println(index);
	}

	public static int search(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length-1, target);
		
	}
	
	private static int binarySearch(int[] nums, int l, int r, int x) {
		if(r >= l) {
			int mid = l+ (r-l)/2;
			if(nums[mid] == x) {
				return mid;
			}
			if(nums[mid] > x) {
				return binarySearch(nums, l, mid-1, x);
			}
			return binarySearch(nums, mid+1, r, x);
		}
		return -1;
	}
	
}
