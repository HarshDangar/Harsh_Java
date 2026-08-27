import java.util.*;

public class P1122 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
        System.out.println(Arrays.toString(relativeSortArray2(arr1, arr2)));
    }

    private static int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n : arr1)
            map.put(n, map.getOrDefault(n, 0) + 1);

        int i = 0;
        for(int n : arr2) {
            for(int j = 0; j < map.get(n); j++) {
                arr1[i++] = n;
            }
            map.remove(n);
        }

        for(int n : map.keySet()){
            for(int j = 0; j < map.get(n); j++) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }

    private static int[] relativeSortArray2(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];

        for (int num: arr1) {
            freq[num]++;
        }

        int index = 0;
        for (int num: arr2) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }

        //Remaining that is already added in sorted index
        for (int num = 0; num < freq.length; num++) {
            while (freq[num] > 0) {
                arr1[index++] = num;
                freq[num]--;
            }
        }
        return arr1;
    }
}
