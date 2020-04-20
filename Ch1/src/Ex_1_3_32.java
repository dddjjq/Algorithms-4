public class Ex_1_3_32 {
    public class DoubleNode {

        private class Node {
            int item;
            Node next;
            Node priv;
        }

        public Node head;
        public Node last;

        public void insertFirst(Node node) {
            node.next = head;
            head.priv = node;
            head = node;
        }

        public void insertTail(Node node) {
            last.next = node;
            node.priv = last;
            last = node;
        }

        public void deleteNode(Node node) {
            node.priv.next = node.next;
            node.next.priv = node.priv;
        }
    }
}
