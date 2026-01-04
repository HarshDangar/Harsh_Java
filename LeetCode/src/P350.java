import java.util.ArrayList;
import java.util.Arrays;

public class P350 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();

        if (nums2[0] > nums1[nums1.length - 1] || nums1[0] > nums2[nums2.length - 1]) {
            return new int[]{};
        }

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else
                j++;
        }

        int[] arr = new int[list.size()];

        int index = 0;
        for (int value : list) {
            arr[index] = value;
            index++;
        }

        return arr;
    }
}
