

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(rotationCount(nums));
    }

    static int rotationCount(int[] arr) {
        int count = 0;
        int start = 0;
        int pivot;
        int end = arr.length-1;

        while(arr[start] > arr[end]) {
            count++;
            start++;
        }

        pivot = count - 1;
        return count;
    }
}
