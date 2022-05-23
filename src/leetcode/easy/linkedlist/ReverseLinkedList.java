package leetcode.easy.linkedlist;


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class ReverseLinkedList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode (2, new ListNode(3, new ListNode(4, new ListNode(4, null)))));
		reverseList(head);
		System.out.println("Done");
	}
	
    public static ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode prev = null;
        while(node != null){
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
            
        }
        return node;
    }
}
