package Generics;

import java.util.Arrays;

public class CustomGenArrayList<T>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }

        data[size++] = num;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        T removed = (T) (data[--size]);

        return removed;
    }

    public int size(){
        return size;
    }

    public void set(int index , int value){
        data[index] = value;
    }

    public T get(int index){
        return (T) (data[index]);
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<String> list = new CustomGenArrayList<>();

        list.add("Harsh");
        list.add("Dangar");

        System.out.println(list);
    }
}
