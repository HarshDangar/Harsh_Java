import java.util.*;

public class P506 {
    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
        System.out.println(Arrays.toString(findRelativeRanks2(score)));
    }

    private static String[] findRelativeRanks(int[] score) {
        int[] temp = Arrays.copyOf(score, score.length);
        Arrays.sort(temp);

        String[] arr = new String[score.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = score.length - 1; i >= 0; i--) {
            map.put(temp[i], score.length - i);
        }

        for (int i = 0; i < score.length; i++) {
            if (map.get(score[i]) == 1)
                arr[i] = "Gold Medal";
            else if (map.get(score[i]) == 2)
                arr[i] = "Silver Medal";
            else if (map.get(score[i]) == 3)
                arr[i] = "Bronze Medal";
            else
                arr[i] = map.get(score[i]).toString();
        }
        return arr;
    }

    private static String[] findRelativeRanks2(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{score[i], i});
        }

        int rank = 1;

        while (!pq.isEmpty()) {
            int[] athlete = pq.poll();
            int idx = athlete[1];

            if (rank == 1) {
                result[idx] = "Gold Medal";
            } else if (rank == 2) {
                result[idx] = "Silver Medal";
            } else if (rank == 3) {
                result[idx] = "Bronze Medal";
            } else {
                result[idx] = String.valueOf(rank);
            }

            rank++;
        }

        return result;
    }
}
