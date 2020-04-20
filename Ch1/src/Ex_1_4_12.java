import java.util.HashSet;
import java.util.Set;

public class Ex_1_4_12 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 8, 10, 11};
        int b[] = {0, 2, 4, 5, 7, 8, 9, 11};
        find(a, b);
    }

    public static void find(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int j : b) {
            if (set.contains(j)){
                System.out.print(j + " ");
            }
        }
    }
}
