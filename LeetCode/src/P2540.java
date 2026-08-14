import java.util.HashSet;
import java.util.Set;

public class P2540 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {2, 4};
        System.out.println(getCommon(nums1, nums2));
        System.out.println(getCommon2(nums1, nums2));
        System.out.println(getCommon3(nums1, nums2));
    }

    private static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }

        return -1;
    }

    //Approach 2 : Using binary search
    private static int getCommon2(int[] nums1, int[] nums2) {
        for (int num : nums1) {
            if (binarySearch(nums2, num)) {
                return num;
            }
        }

        return -1;
    }

    private static boolean binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }

    //Approach 3 : Two Pointer
    private static int getCommon3(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }
}
