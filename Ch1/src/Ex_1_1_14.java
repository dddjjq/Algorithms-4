public class Ex_1_1_14 {

    public static void main(String[] args) {
        System.out.println(getLogMax(32));
    }

    /**
     * 不大于Log2N的最大整数
     * @param n
     * @return
     */
    public static int getLogMax(int n) {
        int result = 0;
        int temp = n;
        while (( temp = temp / 2) > 0) {
            result++;
        }
        return result;
    }
}
