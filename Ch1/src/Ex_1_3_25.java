public class Ex_1_3_25 {

    private static LinkedList<Integer> linkedList = LinkedList.getInstance();

    public static void main(String[] args) {
        Node<Integer> node = new Node<>();
        node.val = 44;
        insertAfter(linkedList.head.next,node);
        linkedList.print();
    }

    /**
     * 插入结点
     * @param node
     */
    public static void insertAfter(Node<Integer> node,Node<Integer> insert) {
        if (node == null || insert == null) return;
        insert.next = node.next;
        node.next = insert;
    }
}
