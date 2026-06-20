import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {
    public static void main(String[] args) {
        /*
            Comparator is interface
         */

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(null);
        System.out.println(words);

        //Now we need sort the string based on length in ascending order
        words.sort(new StringLengthComparator());
        System.out.println(words);

        //Now we sort the list in descending order of length with lamda
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        /*The return type is integer
            so there are three possibilities
            if it returns negative number than o1 comes first and o2 at second
            if it returns 0 than both are same
            otherwise o2 comes first and o2 at second

            Conclusion
            - o1 o2
            0 same preference
            + o2 o1
         */

        return o1 - o2;
        /*Example if o1 = 5 and o2 = 3 than
            o1 - o2 = 5 - 3 which is positive
            o2 will come first and than o1
            meaning it will place [3 5]
         */
    }
}

