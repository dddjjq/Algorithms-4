public class BinarySearch {
    public static int indexOf(int arr[], int key) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] > key) {
                last = mid + 1;
            } else if (key > arr[mid]) {
                first = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(indexOf(arr,6));
    }
}
