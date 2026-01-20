import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class P1636 {
    public static void main(String[] args) {
        int[] arr = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }

    private static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            arr[i] = nums[i];
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (map.get(a) != map.get(b)) {
                    return map.get(a) - map.get(b); // Increasing order for different frequency
                } else {
                    return b - a; // Here b - a because we need element in decreasing order if they have same frequency
                }
            }
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }
}
