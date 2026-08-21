import java.util.HashSet;
import java.util.Set;

public class P1496 {
    public static void main(String[] args) {
        String path = "S";
        System.out.println(isPathCrossing(path));
    }

    private static boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0;
        int y = 0;
        String key = x + "_" + y;
        visited.add(key);

        for (char ch : path.toCharArray()) {
            switch (ch) {
                case 'N' -> y++;
                case 'E' -> x++;
                case 'S' -> y--;
                case 'W' -> x--;
            }

            key = x + "_" + y;
            if (visited.contains(key))
                return true;
            visited.add(key);
        }
        return false;
    }
}
