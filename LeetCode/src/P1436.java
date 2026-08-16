import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class P1436 {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>(List.of(
                List.of("London","New York"),
                List.of("New York","Lima"),
                List.of("Lima","Sao Paulo")
        ));
        System.out.println(destCity(paths));
        System.out.println(destCity2(paths));
    }

    //Approach 1 : Using HashMap
    private static String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();

        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        for (String value: map.values()) {
            if (!map.containsKey(value))
                return value;
        }

        return "";
    }

    //Approach 2 : Using HashSet
    private static String destCity2(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();

        for (List<String> path : paths) {
            set.add(path.getFirst());
        }

        for (List<String> path : paths) {
            if (!set.contains(path.getLast()))
                return path.getLast();
        }

        return "";
    }
}
