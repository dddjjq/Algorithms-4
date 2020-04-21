import java.util.Scanner;

public class Ex_1_5_2 {

    // 90 34 58 72 21 57 03 42
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuickUnion quickUnion = new QuickUnion(10);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int p = Integer.parseInt(line.split(" ")[0]);
            int q = Integer.parseInt(line.split(" ")[1]);
            quickUnion.union(p, q);
            for (int i = 0; i < quickUnion.id.length; i++) {
                System.out.print(quickUnion.id[i] + " ");
            }
            System.out.println();
        }
        //9 9 9 9 9 9 6 9 9 9
    }

    public static class QuickUnion extends UF {

        public QuickUnion(int N) {
            super(N);
        }

        @Override
        public boolean connect(int p, int q) {
            return id[p] == id[q];
        }

        @Override
        public int find(int p) {
            while (p != id[p]) p = id[p];
            return p;
        }

        @Override
        public void union(int p, int q) {
            int pRoot = find(p);
            int qRoot = find(q);
            if (qRoot == pRoot) return;
            id[pRoot] = qRoot;
            count--;
        }
    }
}
