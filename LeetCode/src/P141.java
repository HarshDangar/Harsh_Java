public class P141 {
    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static boolean hasCycle(ListNode head) {
        /* Fast and slow method
            Intuition : Race between two guys if the runway is circular then two different speed guys will come at same
                position at some time because of the loop

            Possibilities :
                1) fast slow -> _ _ slow_fast : fast is behind the slot so in next step they will meet
                2) fast _ slow -> _ _ fast slow : fast is two-step behind the slow then in next step they will become like 1'st possibility
         */

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    private static int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                // Calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
}
