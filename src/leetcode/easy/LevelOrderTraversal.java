package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);
		
		TreeNode node20 = new TreeNode(20,node15, node7);
		TreeNode node9 = new TreeNode(9);
		TreeNode node3 = new TreeNode(3,node9, node20);
		
		List<List<Integer>> levelOrder = levelOrder(node3);
		System.out.println("done!!");
		
	}

	
	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        return levelOrderTraversal(root);
        
    }
    
    private static List<List<Integer>> levelOrderTraversal(TreeNode root){
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	
    	q.offer(root);
    	
    	while(!q.isEmpty()) {
    		 int l = q.size();
    	        List<Integer> level = new ArrayList<>();
    	        for (int i = 0; i < l; i++) {
    	            TreeNode node = q.poll(); 
    	            if (node != null) {
    	                level.add(node.val);
    	                q.add(node.left);
    	                q.add(node.right);
    	            }
    	        }
    	        if (!level.isEmpty()) {
    	            ans.add(level);
    	        }
    		
    		
    	}
    	
    	
    	
    	
		return ans;
        
    }
}
