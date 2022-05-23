package leetcode.easy.binarytree;

import java.util.LinkedList;
import java.util.Queue;

//  Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class MinDepthOfBinaryTree {

	public static void main(String[] args) {
		TreeNode node9 = new TreeNode(9, null, null);
		TreeNode node15 = new TreeNode(15, null, null);
		TreeNode node7 = new TreeNode(7, null, null);

		TreeNode node20 = new TreeNode(20, node15, node7);
		TreeNode root = new TreeNode(3, node9, node20);

		System.out.println(minDepth(root));

	}

	public static int minDepth(TreeNode root) { 
		if(root == null) return 0;
	    int depth = 1;
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.offer(root);
	    while(!q.isEmpty()){
	        int size = q.size();
	        // for each level
	        for(int i=0;i<size;i++){
	            TreeNode node = q.poll();
	            if(node.left == null && node.right == null){
	                return depth;
	            }
	            if(node.left != null){
	                q.offer(node.left);
	            }
	            if(node.right != null){
	                q.offer(node.right);
	            }
	        }
	        depth++;
	    }
	    return depth;
	    
		}
	

}
