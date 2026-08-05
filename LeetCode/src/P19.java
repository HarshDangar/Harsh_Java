public class P19 {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //Approach 1
    private static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = lengthLinkedList(head);

        if (length == n) {
            ListNode temp = head.next;
            head = null;
            return temp;
        }

        ListNode curr = head;
        ListNode prev = null;
        int travel = length - n;

        while (travel-- > 0) {
            prev = curr;
            curr = curr.next;
        }

        if (prev != null)
            prev.next = curr.next;

        curr = null;

        return head;
    }

    //Approach 2
    private static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if (fast == null) //Meaning n == l so we have to delete head
            return head.next;

        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp = null;

        return head;
    }

    private static int lengthLinkedList(ListNode head) {
        int l = 0;

        while (head != null) {
            l++;
            head = head.next;
        }
        return l;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        removeNthFromEnd2(head, 2);
    }
}
