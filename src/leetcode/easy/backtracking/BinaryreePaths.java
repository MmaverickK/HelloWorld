package leetcode.easy.backtracking;

import java.util.ArrayList;
import java.util.List;

import leetcode.easy.dfs.TreeNode;

public class BinaryreePaths {
	
	
	public static void main(String[] args) {
		TreeNode node2 = new TreeNode(5, null, null);
		TreeNode node4 = new TreeNode(2, null, node2);
		TreeNode node5 = new TreeNode(3, null, null);
		TreeNode root = new TreeNode(1, node4, node5);
		
		List<String> paths = binaryTreePaths(root);
		System.out.println("done");

	}

	
	
	public static List<String> binaryTreePaths(TreeNode root) {
	    List<String> answer = new ArrayList<String>();
	    if (root != null) searchBT(root, "", answer);
	    return answer;
	}
	private static void searchBT(TreeNode root, String path, List<String> answer) {
	    if (root.left == null && root.right == null) {
	    	answer.add(path + root.val);
	    	return;
	    }
	    if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
	    if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
	}
}
