public class Ex1_1_13 {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        exchange(arr);
    }

    /**
     * 转置矩阵
     * @param arr
     */
    public static void exchange(int[][] arr) {
        int row = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
