public class Ex_1_3_24 {
    private static LinkedList<Integer> linkedList = LinkedList.getInstance();

    public static void main(String[] args) {
        removeAfter(linkedList.head.next);
        linkedList.print();
    }

    /**
     * 删除后续结点
     * @param node
     */
    public static void removeAfter(Node<Integer> node) {
        if (node == null || node.next == null) return;
        node.next = node.next.next;
    }
}
