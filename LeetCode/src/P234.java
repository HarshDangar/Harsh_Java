public class P234 {
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

    // Solution 1
    private static boolean isPalindrome(ListNode head) {
        ListNode reverse = reverseList(head);

        while (head != null) {
            if (head.val != reverse.val)
                return false;
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode ans = null;
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = ans;
            ans = node;
            head = head.next;
        }
        return ans;
    }

    // Solution 2
    private static boolean isPalindrome2(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList2(mid);

        while (head != null && headSecond != null) {
            if (head.val != headSecond.val)
                return false;
            head = head.next;
            headSecond = headSecond.next;
        }
        return true;
    }

    private static ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }

    private static ListNode reverseList2(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome2(head));
    }
}
