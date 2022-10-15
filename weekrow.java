class weekrow {
    public int[] kWeakestRows(int[][] M, int K) {
        int y = M.length, x = M[0].length;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        int[] ans = new int[K];
        for (int i = 0; i < y; i++) {
            heap.add(-(find(M[i]) << 7) - i);
            if (heap.size() > K) heap.remove();
        }
        while (heap.size() > 0)
            ans[heap.size()-1] = -heap.remove() & (1 << 7) - 1;
        return ans;
    }
    int find(int[] row) {
        int x = row.length;
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + right >> 1;
            if (mid < x && row[mid] > 0) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}
