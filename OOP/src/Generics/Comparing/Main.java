package Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student harsh = new Student(16,8.53f);
        Student denish = new Student(18,7.56f);

        if (harsh.compareTo(denish) >= 0) {
            System.out.println("harsh have more marks");
        } else {
            System.out.println("denish have more marks");
        }

        int[] list = {34,12,76,41,89,22,45};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));
    }
}
