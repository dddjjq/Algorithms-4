public class Ex_1_1_20 {

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }

    /**
     * 阶乘
     * @param n
     * @return
     */
    public static int getFactorial(int n) {
        if (n == 1) return 1;
        return n * getFactorial(n - 1);
    }
}
