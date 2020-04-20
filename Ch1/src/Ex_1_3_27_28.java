public class Ex_1_3_27_28 {

    private static LinkedList<Integer> linkedList = LinkedList.getInstance2();

    public static void main(String[] args) {
        System.out.println(max(linkedList.head));
        System.out.println(max2(linkedList.head));
    }

    /**
     * 获取最大值
     */
    public static int max(Node<Integer> first) {
        int max = 0;
        for (Node<Integer> node = first; node != null; node = node.next) {
            max = node.val > max ? node.val : max;
        }
        return max;
    }

    /**
     * 获取最大值--递归方法
     */
    public static int max2(Node<Integer> first) {
        if (first.next == null) {
            return first.val;
        }
        return Math.max(first.val, max2(first.next));
    }

}
