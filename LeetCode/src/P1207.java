import java.util.HashMap;

public class P1207 {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }

    private static boolean uniqueOccurrences(int[] arr) {
        boolean[] occurance = new boolean[1001];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: map.values()) {
            if (occurance[num])
                return false;

            occurance[num] = true;
        }
        return true;
    }
}
