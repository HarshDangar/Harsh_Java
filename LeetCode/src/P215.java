import java.util.TreeMap;

public class P215 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums, k));
    }

    private static int findKthLargest(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int key: map.descendingKeySet()) {
            if (count + map.get(key) >= k)
                return key;
            else
                count += map.get(key);
        }

        return -1;
    }
}
