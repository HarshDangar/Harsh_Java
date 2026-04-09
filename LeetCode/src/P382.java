import java.util.ArrayList;
import java.util.Random;

public class P382 {
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
}

//class Solution {
//    ArrayList<Integer> list = new ArrayList<>();
//
//    public Solution(P382.ListNode head) {
//        P382.ListNode temp = head;
//
//        while (temp != null) {
//            list.add(temp.val);
//            temp = temp.next;
//        }
//    }
//
//    public int getRandom() {
//        int n = list.size();
//        Random random = new Random();
//
//        return list.get(random.nextInt(0, n));
//    }
//}
