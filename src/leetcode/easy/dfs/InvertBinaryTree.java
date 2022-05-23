package leetcode.easy.dfs;

//   https://leetcode.com/problems/invert-binary-tree/





 
class InvertBinaryTree {
	
	public static void main(String[] args) {
		TreeNode node2 = new TreeNode(2, null, null);
		TreeNode node1 = new TreeNode(1, node2, null);
		
		invertTree(node1);
	}
	
	
    public static TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return null;
        }
        TreeNode left = null;
        TreeNode right = null;
        if(root.left != null){
            left = root.left;
        }
        if(root.right != null){
            right = root.right;
        }
        
        if(right != null){
            root.left = right;
        }
        if(right != null){
            root.right = left;
        }
        invertTree(root.left);
        invertTree(root.right);
       
        return root;
    }
    
   
}
