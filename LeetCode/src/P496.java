import java.util.Arrays;
import java.util.HashMap;

public class P496 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 2, 4}, nums2 = {6, 5, 4, 3, 2, 1, 7};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            if (index + 1 >= nums2.length)
                ans[i] = -1;
            else {
                ans[i] = -1;
                index++;
                while (index < nums2.length) {
                    if (nums2[index] > nums1[i]) {
                        ans[i] = nums2[index];
                        break;
                    }
                    index++;
                }
            }
        }
        return ans;
    }
}
