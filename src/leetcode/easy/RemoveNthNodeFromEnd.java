package leetcode.easy;

public class RemoveNthNodeFromEnd {
	
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
		
		ListNode result = removeNthFromEnd(node1, 2);
		System.out.println("done!!");
		
	}

	
	public static ListNode removeNthFromEnd(ListNode head, int n) { 
        ListNode node = head;
        if(node == null) return head;
        if(node.next == null && n==1){
            head = null;
            return head;
        }
        int length = 0;
        
        while(node != null){
            length++;
            node = node.next;
        }
        int positionToDelete = length-n;
        int counter = 0;
        ListNode prev = null;
        node = head;
        while(counter != positionToDelete){
            prev = node;
            node = node.next;
            counter++;
        }
        // System.out.println(prev.val);
        if(prev != null) {
        	prev.next = node.next;
        }else {
        	head = head.next;
        }
        
        return head;
    
    }
}


  
