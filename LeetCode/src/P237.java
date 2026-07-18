public class P237 {
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

    private static void deleteNode(ListNode node) {
        ListNode prev = null;

        while (node != null && node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }

        if (node != null) {
            if (prev != null)
                prev.next = null;
            else
                node = null;
        }
    }

    //Approach 2
    private static void deleteNode2(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
