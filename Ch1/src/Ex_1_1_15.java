public class Ex_1_1_15 {

    public static void main(String[] args) {
        int[] a = {1, 1, 5, 2, 6, 4, 5, 8, 5, 6, 8, 9, 5};
        int[] result = histogram(a, 10);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] histogram(int[] a, int m) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = getCount(a, i);
        }
        return arr;
    }

    public static int getCount(int[] arr, int i) {
        int result = 0;
        for (int j : arr) {
            if (j == i) {
                result++;
            }
        }
        return result;
    }
}
