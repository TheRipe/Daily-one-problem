public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node =  new ListNode(0);
        ListNode temp = head;
        ListNode n = node;
        while (temp != null) {
            ListNode t = n.next;
            n.next = temp;
            temp = temp.next;
            n.next.next = t;
        }
        return node.next;
    }
}
