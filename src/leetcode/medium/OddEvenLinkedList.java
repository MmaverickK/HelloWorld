package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode oddEvenList = oddEvenList(node1);
		
		System.out.println("done!!");
	}
	
	public static ListNode oddEvenList(ListNode head) {
        int counter = 0;
        
        ListNode node = head;
        List<ListNode> odd = new ArrayList<>();
        List<ListNode> even = new ArrayList<>();
        while(node != null){
            counter++;
            if(counter % 2 != 0){
                odd.add(node);
            }
            if(counter % 2 == 0){
                even.add(node);
            }
            node = node.next;
            
            
        }
        ListNode ansNode = null;
        ListNode prev = null;
        counter = 0;
        for(ListNode temp : odd){
            counter++;
            if(counter == 1){
               ansNode = temp; 
            }
            if(prev != null){
                prev.next = temp;
            }
            prev = temp;
        }
       
        for(ListNode temp : even){
            if(prev != null){
                prev.next = temp;
                temp.next = null;
            }
            prev = temp;
        }
        return ansNode;
    }

}
