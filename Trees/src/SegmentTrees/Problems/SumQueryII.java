package SegmentTrees.Problems;

import java.util.ArrayList;
import java.util.List;

public class SumQueryII {
    //https://www.geeksforgeeks.org/problems/sum-of-query-ii5310/1
    public static void main(String[] args) {
        int n = 5, q = 2;
        int[] arr = {26, 30, 48, 29, 8}, queries = {4, 4, 2, 3};
        System.out.println(querySum(n, arr, q, queries));
    }

    private static List<Integer> querySum(int n, int[] arr, int q, int[] queries) {
        int[] segmentTree = new int[4 * n];

        buildSegmentTree(0, 0, n - 1, segmentTree, arr);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 2 * q; i += 2) {
            int start = queries[i] - 1; //Indexing is started at 1
            int end = queries[i + 1] - 1;

            result.add(querySegmentTree(start, end, 0, 0, n - 1, segmentTree));
        }
        return result;
    }

    private static void buildSegmentTree(int idx, int l, int r, int[] segmentTree, int[] arr) { 
        if (l == r) {
            segmentTree[idx] = arr[l];
            return;
        }

        int mid = l + (r - l) / 2;
        buildSegmentTree(2 * idx + 1, l, mid, segmentTree, arr);
        buildSegmentTree(2 * idx + 2, mid + 1, r, segmentTree, arr);

        segmentTree[idx] = segmentTree[2 * idx + 1] + segmentTree[2 * idx + 2];
    }

    private static int querySegmentTree(int start, int end, int idx, int l, int r, int[] segmentTree) {
        if (l > end || r < start) {
            return 0;
        }

        if (l >= start && r <= end) { //Completly lie in the index
            return segmentTree[idx];
        }

        int mid = l + (r - l) / 2;
        return querySegmentTree(start, end, 2 * idx + 1, l, mid, segmentTree) +
                querySegmentTree(start, end, 2 * idx + 2, mid + 1, r, segmentTree);
    }
}
