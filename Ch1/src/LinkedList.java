public class LinkedList<T> {

    public Node<T> head;
    public Node<T> current;

    public void add(T t) {
        if (head == null) {
            head = new Node<>();
            head.val = t;
            current = head;
        } else {
            Node<T> node = new Node<>();
            node.val = t;
            current.next = node;
            current = node;
        }
    }

    public static LinkedList<Integer> getInstance() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    public static LinkedList<Integer> getInstance2() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 10; i > 0; i--) {
            linkedList.add(i);
        }
        return linkedList;
    }

    public void print() {
        Node<T> node = head;
        while (node.next != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.print(node.val + " ");
        System.out.println();
    }
}
