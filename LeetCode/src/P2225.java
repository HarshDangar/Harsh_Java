import java.lang.reflect.Array;
import java.util.*;

public class P2225 {
    public static void main(String[] args) {
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        System.out.println(findWinners(matches));
    }

    private static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] match : matches) {
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }

        List<Integer> notLost = new ArrayList<>();
        List<Integer> oneLost = new ArrayList<>();

        for (int[] match: matches) {
            int loser = match[1];
            int winner = match[0];

            if (map.get(loser) == 1)
                oneLost.add(loser);

            if (!map.containsKey(winner)) {
                notLost.add(winner);
                map.put(winner, 2); // If an element comes more than one times in winner than to avoid duplicate in notLost
            }
        }
        Collections.sort(notLost);
        Collections.sort(oneLost);

        return Arrays.asList(notLost, oneLost);
    }
}
