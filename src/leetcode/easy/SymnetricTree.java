package leetcode.easy;

import java.util.Stack;

public class SymnetricTree {

	public static void main(String[] args) {
		TreeNode node3l = new TreeNode(3);
		TreeNode node4l = new TreeNode(4);
		TreeNode node2l = new TreeNode(2, node3l, node4l);

		TreeNode node4r = new TreeNode(4);
		TreeNode node3r = new TreeNode(3);
		TreeNode node2r = new TreeNode(2, node4r, node3r);

		TreeNode root = new TreeNode(1, node2l, node2r);

		System.out.println(isSymmetric(root));

	}

	public static boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		
		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(root.left);
		stk.push(root.right);
		
		while(!stk.isEmpty()) {
			TreeNode node1 = stk.pop();
			TreeNode node2 = stk.pop();
			
			if(node1 == null && node2 == null) {
				continue;
			}
			if(node1 == null || node2 == null) {
				return false;
			}
			
			if(node1.val != node2.val) {
				return false;
			}
			
			stk.push(node1.left);
			stk.push(node2.right);
			stk.push(node1.right);
			stk.push(node2.left);
			
			
			
		}
		
		return true;
		
		
	}
}
