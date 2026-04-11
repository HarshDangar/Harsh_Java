import java.util.Arrays;

public class P1356 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sortByBits2(nums)));
    }

    private static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10001;
        }
        return arr;
    }

    private static int[] sortByBits2(int[] arr) {
        Integer[] arr2 = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA == countB)
                return a.compareTo(b);

            return Integer.compare(countA, countB);
            //  If countA < countB -> compare will return negative -1 meaning ascending order
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr2[i];
        }
        return arr;
    }
}
