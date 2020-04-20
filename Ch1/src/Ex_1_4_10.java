public class Ex_1_4_10 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 4, 4, 7, 8, 9, 10, 11, 12};
        System.out.println(getIndex(arr, 4));
    }

    public static int getIndex(int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (key < arr[mid]) {
                last = mid - 1;
            } else if (key == arr[mid] && mid > 0 && key == arr[mid - 1]) {
                last = mid - 1;
            } else if (key > arr[mid]) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
