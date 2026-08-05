import java.util.HashSet;
import java.util.Set;

public class P160 {
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

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while(headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while(headB != null) {
            if(set.contains(headB))
                return headB;
            headB = headB.next;
        }
        return null;
    }

    private static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        int diff = difference(headA, headB);

        //Difference will be cleared here
        if(diff < 0) {
            while(diff++ != 0)
                headB = headB.next;
        } else {
            while(diff-- != 0)
                headA = headA.next;
        }

        //Both will be at same distance from intersection
        while(headA != null) {
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private static int difference(ListNode head1, ListNode head2) {
        int len1 = 0, len2 = 0;
        while(head1 != null || head2 != null) {
            if(head1 != null) {
                len1++;
                head1 = head1.next;
            }
            if(head2 != null) {
                len2++;
                head2 = head2.next;
            }
        }
        return len1 - len2;
        //If negative, length of list2 > list1
    }
}
