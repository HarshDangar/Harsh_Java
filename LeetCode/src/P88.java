import java.util.Arrays;

public class P88 {
    public static void main(String[] args) {
        int[] nums1 = {0}, nums2 = {1};
        int m = 0, n = 1;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1;
        int y = n - 1; // index

        int index = m + n - 1; // element placing index

        while (y >= 0) {
            if (x >= 0 && nums1[x] > nums2[y]) {
                nums1[index] = nums1[x];
                index--;
                x--;
            } else {
                nums1[index] = nums2[y];
                index--;
                y--;
            }
        }
    }
}
