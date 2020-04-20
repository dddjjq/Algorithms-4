public class Ex_1_3_26 {

    private static LinkedList<Integer> linkedList = LinkedList.getInstance();

    public static void main(String[] args) {
        remove(3);
        remove(0);
        linkedList.print();
    }


    /**
     * 移除某个键
     */
    public static void remove(int key) {
        if (linkedList.head.val ==key) linkedList.head = linkedList.head.next;
        for (Node<Integer> node = linkedList.head; node != null; node = node.next) {
            if (node.next != null && node.next.val == key){
                node.next = node.next.next;
            }
        }
    }


}
