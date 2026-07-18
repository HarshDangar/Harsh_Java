import java.util.*;

public class P451 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(frequencySort(s));
    }

    private static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Character> sortList = new ArrayList<>(map.keySet());
        sortList.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder result = new StringBuilder();
        for (char c : sortList) {
            result.append(String.valueOf(c).repeat(map.get(c)));
        }

        return result.toString();
    }

    private static String frequencySort2(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );

        pq.addAll(freq.entrySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }
}
