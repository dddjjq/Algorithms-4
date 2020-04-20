public class Ex_1_3_21 {

    private static LinkedList<Integer> linkedList = LinkedList.getInstance();

    public static void main(String[] args) {
        System.out.println(find(linkedList.head,5));
        System.out.println(find(linkedList.head,9));
        System.out.println(find(linkedList.head,11));
        System.out.println(find(linkedList.head,23));
    }

    public static boolean find(Node<Integer> node, int key) {
        while (node.next != null) {
            if (node.val == key) {
                return true;
            } else {
                node = node.next;
            }
        }
        return node.val == key;
    }
}
