package leetcode.easy;

public class IsValidBST {
	public static void main(String[] args) {
		
		TreeNode node3 = new TreeNode(3);
		TreeNode node7 = new TreeNode(7);
		
		TreeNode node6 = new TreeNode(6,node3, node7);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5,node4, node6);
		System.out.println(isValidBST(node5));
		
	}

// My Solution	
//    private static boolean isValid(TreeNode node){
//        if(node == null){
//            return true;
//        }
//       
////		if (node.left == null && node.right == null) {
////			return true;
////		}
//       
//        if(node.left != null && node.left.val >= node.val){
//            return false;
//        }
//
//        if(node.right != null && node.right.val <= node.val){
//            return false;
//        }
//        
//        
//
//        
//        if(!isValid(node.left) || !isValid(node.right)){
//            return false;
//        }
//        return true;
//       
//            
//        
//    }

// Discuss solution
	
	public static boolean isValidBST(TreeNode root) {
		return isValid(root, null, null);
	}

	static boolean isValid(TreeNode root, Integer min, Integer max) {
		if (root == null)
			return true;

		if ((min != null && root.val <= min) || (max != null && root.val >= max))
			return false;

		return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
	}

}
