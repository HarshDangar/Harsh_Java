import java.util.HashMap;

public class P3005 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums));
    }

    private static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int val: nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
            max = Math.max(max, map.get(val));
        }

        for (int value: map.values()) {
            if (value == max)
                count += max;
        }
        return count;
    }
}
