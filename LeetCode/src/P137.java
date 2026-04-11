import java.util.HashMap;

public class P137 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        System.out.println(singleNumber2(nums));
    }

    //Approach 1
    private static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 3)
                map.remove(num);
        }
        for (int value : map.keySet()) {
            ans = value;
        }
        return ans;
    }

    //Approach 2: Calculating k'th bit and making result
    private static int singleNumber2(int[] nums) {
        int result = 0;

        for (int k = 0; k < 32; k++) {
            int temp = 1 << k;
            int countZeros = 0, countOnes = 0;
            for (int num: nums) {
                if ((num & temp) == 0)
                    countZeros++;
                else
                    countOnes++;
            }

            if (countOnes % 3 == 1) //Changing the k'th bit to 1
                result = result | temp;
        }
        return result;
    }
}
