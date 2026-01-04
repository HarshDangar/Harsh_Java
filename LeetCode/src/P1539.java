public class P1539 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        System.out.println(findKthPositive(arr, 5));
    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 1, l = 0, j = 0;
        int[] temp = new int[k];
        temp[k - 1] = 0;

        while (j < k) {
            if (l < arr.length) {
                if (arr[l] == start) {
                    start++;
                    l++;
                } else {
                    temp[j] = start;
                    start++;
                    j++;
                }
            } else {
                temp[j] = start;
                start++;
                j++;
            }
        }

        return temp[k - 1];
    }
}
