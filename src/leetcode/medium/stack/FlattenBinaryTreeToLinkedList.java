package leetcode.medium.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
	
	public static void main(String[] args) {
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		TreeNode node2 = new TreeNode(2,node3, node4);
		TreeNode node5 = new TreeNode(5,null, node6);
		TreeNode node1 = new TreeNode(1,node2, node5);
		
		flatten(node1);
		
	}
	
	public static void flatten(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        List<TreeNode> list = new ArrayList<>();
        TreeNode curr;
        TreeNode newRoot;
        stk.push(root);
        
        while(!stk.isEmpty()){
            curr = stk.pop();
            if(curr != null){
                list.add(curr);
                // newTree(curr, newRoot);
                if(curr.right != null){
                    stk.push(curr.right);
                }
                if(curr.left != null){
                    stk.push(curr.left);
                }
            }
        }
        
        for(int i=0; i<list.size()-1; i++){
        	list.get(i).left = null;
        	list.get(i).right = null;
            list.get(i).right= list.get(i+1);
        }
        
//        ListIterator<TreeNode> itr = list.listIterator();
//        
//        TreeNode temp;
//        while(itr.hasNext()) {
//        	
//        }
        
    }

}
