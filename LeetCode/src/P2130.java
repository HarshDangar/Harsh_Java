import java.util.ArrayList;

public class P2130 {
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

    private static int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int answer = Integer.MIN_VALUE;
        int i = 0, j = list.size() - 1;

        while (i < j) {
            if (list.get(i) + list.get(j) > answer)
                answer = list.get(i) + list.get(j);
            i++;
            j--;
        }

        return answer;
    }

    //Approach 2 - Reverseing the list after the middle element
    private static int pairSum2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while(slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        int answer = 0;
        ListNode p1 = head;
        ListNode p2 = prev;

        while(p2 != null) {
            answer = Math.max(answer, p1.val + p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }

        return answer;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(pairSum(head));
    }
}
