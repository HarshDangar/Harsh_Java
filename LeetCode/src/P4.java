public class P4 {
    public static void main(String[] args) {
        int[] nums1 = {1}, nums2 = {1,2,3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int[] arr = new int[(total & 1) == 1 ? (total + 1) / 2 : (total / 2) + 1];

        int start1 = 0, start2 = 0;

        for (int count = 0; count <= total / 2; count++) {
            if (start1 != nums1.length && start2 != nums2.length) {
                if (nums1[start1] < nums2[start2]) {
                    arr[count] = nums1[start1++];
                } else {
                    arr[count] = nums2[start2++];
                }
            } else if (start1 < nums1.length) {
                arr[count] = nums1[start1++];
            } else {
                arr[count] = nums2[start2++];
            }
        }

        if ((total & 1) == 1)
            return arr[arr.length - 1];
        else
            return (double) (arr[arr.length - 2] + arr[arr.length - 1]) / 2;
    }
}
