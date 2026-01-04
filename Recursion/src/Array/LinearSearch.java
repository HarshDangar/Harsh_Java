package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,43,25,742,46,43,25};

        System.out.println(findAllIndexWithList2(arr,25,0));
    }

    static boolean check(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || check(arr, target , index+1);
    }

    static int findIndex(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return findIndex(arr, target , index+1);
    }

    // In below solution we took list from outside and not in function argument

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target , int index){
        if (index == arr.length){
            return;
        }

        if (arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr , target , index+1);
    }

    // In below solution we took arraylist inside the function argument

    static ArrayList<Integer> findAllIndexWithList(int[] arr, int target, int index, ArrayList<Integer> list2){
        if (index == arr.length){
            return list2;
        }

        if (arr[index] == target){
            list2.add(index);
        }

        return findAllIndexWithList(arr , target , index+1 , list2);
    }

    static ArrayList<Integer> findAllIndexWithList2(int[] arr, int target, int index){
        ArrayList<Integer> list2 = new ArrayList<>();

        if (index == arr.length){
            return list2;
        }

        if (arr[index] == target){
            list2.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexWithList2(arr, target, index+1);

        list2.addAll(ansFromBelowCalls);

        return list2;
    }
}
