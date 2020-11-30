public class s2 {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        int carry = 0;
        do {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            cur.val = (sum + carry) % 10;
            carry = (sum + carry) > 10 ? 1 : 0;
            l1 = l1.next;
            l2 = l2.next;
        } while(l1 != null || l2 != null);
        return head;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

