import java.util.*;

public class P349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();

        if (nums2[0] > nums1[nums1.length - 1] || nums1[0] > nums2[nums2.length - 1]) {
            return new int[]{};
        }

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else
                j++;
        }

        int[] arr = new int[set.size()];

        int index = 0;
        for (int value : set) {
            arr[index] = value;
            index++;
        }

        return arr;
    }
}
