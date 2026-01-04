package Array;

import Sorting.MergeSort;

public class CheckSortedArray  {
    public static void main(String[] args) {
        int[] arr = {1,2,3,46,5,6,7,8,89};
        System.out.println(check(arr , 0));
    }

    public static boolean check(int[] arr , int i){
        if (i+1 >= arr.length){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        if(arr[i] <= arr[i+1]){
            return check(arr , i+1);
        }

        return false;
    }
}
