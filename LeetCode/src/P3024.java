public class P3024 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 3};
        System.out.println(triangleType(nums));
    }

    private static String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a)
            return "none"; // Triangle conditions

        if (a == b && b == c) {
            return "equilateral";
        }

        if (a == b || b == c || c == a)
            return "isosceles";

        return "scalene";
    }
}
