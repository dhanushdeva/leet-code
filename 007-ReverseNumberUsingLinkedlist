//007-ReverseNumberUsingLinkedlist
class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode prev = null;
      ListNode cur = head;
      ListNode newnode;
      while(cur != null)  
      {
          newnode = cur.next;
          cur.next = prev;
          prev = cur;
          cur = newnode;
      }
      return prev;
    }
}
