public class Ex_1_3_20 {
    private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static LinkedList<Integer> linkedList;

    public static void main(String[] args) {
        initNode();
        deletePosition(1);
        linkedList.print();
    }

    public static void initNode() {
        linkedList = new LinkedList<>();
        for (int i : arr) {
            linkedList.add(i);
        }
    }

    /**
     * 删除第k个元素
     */
    public static void deletePosition(int k) {
        Node<Integer> node = linkedList.head;
        int count = 0;
        if (k == 0) {
            linkedList.head = node.next;
            return;
        }
        while (node.next != null) {
            if (count == k - 1) {
                node.next = node.next.next;
            }
            count++;
            node = node.next;
        }
    }
}
