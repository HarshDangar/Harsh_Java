package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }

        data[size++] = num;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove(){
        int removed = data[--size];

        return removed;
    }

    public int size(){
        return size;
    }

    public void set(int index , int value){
        data[index] = value;
    }

    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        CustomArrayList list2 = new CustomArrayList();

//        list2.add(3);
//        list2.add(7);
//        list2.add(9);

        for (int i = 0; i < 15; i++) {
            list2.add(2 * i);
        }

        System.out.println(list2);

//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1,6789);
//        list.size();
//        list.isEmpty();
    }
}
