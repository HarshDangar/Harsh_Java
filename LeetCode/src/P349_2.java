import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class P349_2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {7, 6};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : nums1) {
            set.add(value);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : nums2) {
            if (set.contains(value)) {
                list.add(value);
                set.remove(value);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
