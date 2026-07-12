import java.util.HashMap;

public class P904 {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2, 4, 4, 4};
        System.out.println(totalFruit(fruits));
    }

    private static int totalFruit(int[] fruits) {
        int n = fruits.length;
        int i = 0, j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        while (j < n) {
            //Add the fruit in the map
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            //We already have two fruit type in basket
            //We will shift the i pointer till we only have two type of fruits in the basket
            if (map.size() > 2) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0)
                    map.remove(fruits[i]);
                i++;
            }

            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
