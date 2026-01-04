public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);

        if (head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){

        Node node = head;

        if (head != null){
            do {
                System.out.print(node.value + " -> ");
                if (node.next != null){
                    node = node.next;
                }
            } while (node != head);
            System.out.println("Head");
        }
    }

    public void delete(int val){
        Node node = head;

        if (node == null){
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.value == val){
            // means we have to shift head by one position and after that we have to assign tail to next means head

            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node temp = node.next;
            if (temp.value == val){
                head.next = temp.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    private class Node{
        private int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
