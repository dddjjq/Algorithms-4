import java.util.Scanner;

public class Ex_1_5_1 {

    // 90 34 58 72 21 57 03 42
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuickFind quickFind = new QuickFind(10);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int p = Integer.parseInt(line.split(" ")[0]);
            int q = Integer.parseInt(line.split(" ")[1]);
            quickFind.union(p, q);
            for (int i = 0; i < quickFind.id.length; i++) {
                System.out.print(quickFind.id[i] + " ");
            }
            System.out.println();
        }
        //9 9 9 9 9 9 6 9 9 9
    }

    public static class QuickFind extends UF {

        public QuickFind(int N) {
            super(N);
        }

        @Override
        public boolean connect(int p, int q) {
            return id[p] == id[q];
        }

        @Override
        public int find(int p) {
            return id[p];
        }

        @Override
        public void union(int p, int q) {
            int pId = find(p);
            int qId = find(q);
            if (pId != qId) {
                for (int i = 0; i < id.length; i++) {
                    if (id[i] == qId) {
                        id[i] = pId;
                    }
                }
            }
            count--;
        }
    }
}
