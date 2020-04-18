import java.util.Objects;

public class Ex_1_3_12 {
    public static class Stack<T> {

        @SuppressWarnings("all")
        T[] arr = (T[]) new Objects[1000];
        int top = 0;

        public Stack() {

        }

        public void push(T item) {
            arr[top++] = item;
        }

        public T pop() {
            return arr[top--];
        }

        public boolean isEmpty() {
            return top == 0;
        }

        public Stack<T> copy(Stack<T> stack) {
            Stack<T> copy = new Stack<T>();
            while (!stack.isEmpty()) {
                copy.push(stack.pop());
            }
            return copy;
        }
    }
}
