public class Ex_1_3_30 {
    private static LinkedList<Integer> linkedList = LinkedList.getInstance2();

    public static void main(String[] args) {
        System.out.println(reverse());
    }

    public static Node<Integer> reverse() {
        Node<Integer> first = linkedList.head;
        Node<Integer> reverse = null;
        while (first.next != null) {
            Node<Integer> second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }
        return reverse;
    }
}
