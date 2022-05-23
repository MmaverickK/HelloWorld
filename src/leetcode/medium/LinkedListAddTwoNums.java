package leetcode.medium;

import java.util.Stack;

public class LinkedListAddTwoNums {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		
		
		node1.next = node2;
		node2.next = node3;
		
		
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);
		
		node4.next = node5;
		node5.next = node6;
		
		ListNode ans = addTwoNumbers(node1, node4);
		System.out.println("done!!!");
		
	}
//  My Solution
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		int num1 = 0;
//		int multiplier = 1;
//		while (l1 != null) {
//			num1 += multiplier * l1.val;
//			l1 = l1.next;
//			multiplier *= 10;
//		}
//
//		int num2 = 0;
//		multiplier = 1;
//		while (l2 != null) {
//			num2 += multiplier * l2.val;
//			l2 = l2.next;
//			multiplier *= 10;
//		}
//
//		int num3 = num1 + num2;
//
//		int temp = num3;
////		int dividor = 1;
////		while (temp > 10) {
////			temp /= 10;
////			dividor *= 10;
////
////		}
//
//		ListNode node = null;
//		ListNode prev = null;
//		ListNode ansHead = null;
//		temp = num3;
//		String string_number = Integer.toString(num3);
//		Stack<ListNode> stk = new Stack<ListNode>();
//		for (int i = 0; i < string_number.length(); i++) {
//			node = new ListNode();
////			if (prev != null) {
////				prev.next = node;
////			}
//			node.val = Integer.parseInt(String.valueOf(string_number.charAt(i)));
//			node.next = null;
//			stk.push(node);
////			if (prev == null) {
////				ansHead = node;
////			}
////			prev = node;
//		}
//
//		while(!stk.isEmpty()) {
//			ListNode theNode = stk.pop();
//			if(prev != null) {
//				prev.next = theNode;
//			}else {
//				ansHead = theNode;
//			}
//			prev = theNode;
//		}
//		
//		return ansHead;
//	}

	
	// Discuss solution
	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 int carry = 0;
		    ListNode node, temp = new ListNode(0);
		    node = temp;
		    while (l1 != null || l2 != null || carry != 0) {
		        if (l1 != null) {
		            carry += l1.val;
		            l1 = l1.next;
		        }
		        if (l2 != null) {
		            carry += l2.val;
		            l2 = l2.next;
		        }
		        node.next = new ListNode(carry%10);
		        carry /= 10;
		        node = node.next;
		    }
		    return temp.next;
	}

}
