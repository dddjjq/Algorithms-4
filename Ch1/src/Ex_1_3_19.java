public class Ex_1_3_19 {

    private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static LinkedList<Integer> linkedList;

    public static void main(String[] args) {
        initNode();
        linkedList.print();
        deleteTail();
        linkedList.print();
    }

    public static void initNode() {
        linkedList = new LinkedList<>();
        for (int i : arr) {
            linkedList.add(i);
        }
    }

    /**
     * 删除尾结点
     */
    public static void deleteTail() {
        Node<Integer> node = linkedList.head;
        while (node.next != null
                && node.next.next != null) {
            node = node.next;
        }
        node.next = null;

    }
}
