import java.util.*;

public class P2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3}, nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1, nums2));
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int j : nums1) {
            set1.add(j);
        }

        for (int j : nums2) {
            set2.add(j);
        }

        for (int j: set1) {
            if (!set2.contains(j))
                list1.add(j);
        }

        for (int j: set2) {
            if (!set1.contains(j))
                list2.add(j);
        }

        return Arrays.asList(list1, list2);
    }
}
