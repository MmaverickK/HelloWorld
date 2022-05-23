package leetcode.easy.dfs;

import java.util.ArrayList;
import java.util.List;



 

public class LevelAvgOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3, null, null);
		TreeNode node2 = new TreeNode(5, null, null);
		TreeNode node3 = new TreeNode(7, null, null);
		TreeNode node4 = new TreeNode(2, node1, node2);
		TreeNode node5 = new TreeNode(6, null, node3);
		TreeNode root = new TreeNode(4, node4, node5);
		
		List<Double> averageOfLevels = averageOfLevels(root);
		System.out.println("done");
	}
	
    public  static List < Double > averageOfLevels(TreeNode root) {
        List < Integer > count = new ArrayList <> ();
        List < Double > res = new ArrayList <> ();
        average(root, 0, res, count);
        for (int i = 0; i < res.size(); i++)
            res.set(i, res.get(i) / count.get(i));
        return res;
    }
    public static void average(TreeNode t, int i, List < Double > sum, List < Integer > count) {
        if (t == null)
            return;
        if (i < sum.size()) {
            sum.set(i, sum.get(i) + t.val);
            count.set(i, count.get(i) + 1);
        } else {
            sum.add(1.0 * t.val);
            count.add(1);
        }
        average(t.left, i + 1, sum, count);
        average(t.right, i + 1, sum, count);
    }
}

