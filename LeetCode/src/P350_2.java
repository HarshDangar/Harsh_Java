import java.util.Arrays;

public class P350_2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int k = 0;

        if (nums2[0] > nums1[nums1.length - 1] || nums1[0] > nums2[nums2.length - 1]) {
            return new int[]{};
        }

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums1[k] = nums2[j];
                i++;
                j++;
                k++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else
                j++;
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
