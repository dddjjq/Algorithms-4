public class Ex_1_1_19 {

    public static final int length = 1000;
    public static int[] arr = new int[length];

    public static void main(String[] args) {
        System.out.println(fibonacci(31));
    }

    public static int fibonacci(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        if (arr[n - 1] != 0 && arr[n - 2] != 0) {
            return arr[n - 1] + arr[n - 2];
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
