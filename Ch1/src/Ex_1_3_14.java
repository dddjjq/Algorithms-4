import java.util.Arrays;

public class Ex_1_3_14 {
    
    public static class Queue {
        String[] arr = new String[100];
        int top;

        public Queue() {

        }

        public void enqueue(String item) {
            arr[top++] = item;
            if (top > arr.length/2)
                resize();
        }

        public String dequeue() {
            String temp = arr[top--];
            arr[top] = null;
            return temp;
        }

        public void resize() {
            arr = Arrays.copyOf(arr,arr.length * 2);
        }
    }
}
