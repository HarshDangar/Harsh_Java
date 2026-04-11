package SegmentTrees.Problems;

public class RangeMinQuery {
    static int[] st;
    private static void buildSegmentTree(int idx, int l, int r, int[] arr) {
        if (l == r) {
            st[idx] = arr[l];
            return;
        }

        int mid = l + (r - l) / 2;
        buildSegmentTree(2 * idx + 1, l, mid, arr);
        buildSegmentTree(2 * idx + 2, mid + 1, r, arr);

        st[idx] = Integer.min(st[2 * idx + 1], st[2 * idx + 2]);
    }

    //Construct segment tree
    private static int[] constructST(int[] arr, int n) {
        // Allocate memory for segment tree
        int height = (int) Math.ceil(Math.log(n) / Math.log(2));
        int size = 2 * (int) Math.pow(2, height) - 1;
        st = new int[size];

        // Build the segment tree
        buildSegmentTree(0, 0, n - 1, arr);

        return st;
    }

    private static int query(int start, int end, int idx, int l, int r) {
        if (l > end || r < start) {
            return Integer.MAX_VALUE;
        }

        if (l >= start && r <= end) {
            return st[idx];
        }

        int mid = l + (r - l) / 2;
        return Integer.min(query(start, end, 2 * idx + 1, l, mid),
                query(start, end, 2 * idx + 2, mid + 1, r));
    }

    //Range Minimum Query
    private static int RMQ(int[] st, int n, int l, int r) {
        return query(l, r, 0, 0, n - 1);
    }
}
