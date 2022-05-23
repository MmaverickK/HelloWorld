package leetcode.easy.stack;

import java.util.Stack;

//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class PalindromeLinkedList {
	
	public static void main(String[] args) {
		ListNode node4 = new ListNode(1);
		ListNode node3 = new ListNode(2, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		System.out.println(isPalindrome(node1));
	}
	
    public static boolean isPalindrome(ListNode head) {
    	Stack<ListNode> stack = new Stack<ListNode>();
    	ListNode node = head;
    	while(node != null) {
    		stack.push(node);
    		 node = node.next;
    	}
    	
    	node = head;
    	while(node != null) {
    		ListNode pop = stack.pop();
    		if(node.val != pop.val) {
    			return false;
    		}
    		 node = node.next;
    	}
    	
		return true;
        
        
    }
}
