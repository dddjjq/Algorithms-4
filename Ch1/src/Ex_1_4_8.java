import java.util.HashMap;

public class Ex_1_4_8 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1, 2, 1, 1 };
        count(a);
    }

    public static void count(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int j : map.keySet()) {
            System.out.println(j + "有" + map.get(j)/2 + "对");
        }
    }
}
