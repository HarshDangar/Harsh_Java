public class P1863 {
    public static void main(String[] args) {
        int[] nums = {5,1,6};
        System.out.println(subsetXORSum(nums));
    }

    private static int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0); //Because 0 ^ num will be num
    }

    private static int helper(int[] nums, int index, int curr) {
        //DFS with traversing every index of the element
        if (index == nums.length)
            return curr;

        int left = helper(nums, index + 1, curr ^ nums[index]); // Left meaning we are including the element
        int right = helper(nums, index + 1, curr); // Right meaning we are excluding the element

        return left + right; //Ans will be left + right because we have traverse the all subsets
    }
}
