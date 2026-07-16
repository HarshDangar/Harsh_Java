import java.util.HashMap;

public class P560 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2));
    }

    private static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        int cumuSum = 0;
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++) {
            cumuSum += nums[i];

            if (map.containsKey(cumuSum - k)) {
                result += map.get(cumuSum - k);
            }

            map.put(cumuSum, map.getOrDefault(cumuSum, 0) + 1);
        }
        return result;
    }
}
