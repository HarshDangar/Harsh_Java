import java.util.HashMap;

public class P2001 {
    public static void main(String[] args) {
        int[][] rectangles = {{4,5},{7, 8}};
        System.out.println(interchangeableRectangles(rectangles));
    }

    private static long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> map = new HashMap<>();
        long ans = 0;

        for (int[] rectangle: rectangles) {
            double ratio = (double) rectangle[0] / rectangle[1];
            map.put(ratio, map.getOrDefault(ratio, 0) + 1);
        }

        for (Double key : map.keySet()) {
            ans += (long) map.get(key) * (map.get(key) - 1) / 2;
            // n(n-1)/2
        }

        return ans;
    }
}
