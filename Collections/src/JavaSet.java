import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class JavaSet {
    public static void main(String[] args) {
        /*
            Interface that extends Collection framework
            Set --> HashSet, LinkedHashSet, TreeSet, EnumSet
            Set is not thread safe
         */

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set1 = map.keySet();
        //In map collection of all key is set

        //For thread safe
        Set<Integer> integers = Collections.synchronizedSet(set); //But it is not generally used instead we use

        ConcurrentSkipListSet<Integer> skipListSet = new ConcurrentSkipListSet<>();
        //It is thread safe
    }
}
