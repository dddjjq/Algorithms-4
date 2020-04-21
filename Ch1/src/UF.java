public abstract class UF {
    int[] id;
    int count;

    public UF(int N) {
        id = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public abstract boolean connect(int p, int q);

    public abstract int find(int p);

    public abstract void union(int p, int q);
}
