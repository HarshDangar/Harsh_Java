import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P841 {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1,3));
        rooms.add(List.of(3,0,1));
        rooms.add(List.of(2));
        rooms.add(List.of(0));

        System.out.println(canVisitAllRooms(rooms));
    }

    //Approach 1 : Using stack
    private static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] check = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();

        stack.addAll(rooms.getFirst());

        while (!stack.isEmpty()) {
            int i = stack.pop();
            if (!check[i]) {
                check[i] = true;
                stack.addAll(rooms.get(i));
            }
        }

        for (int i = 1; i < check.length; i++) {
            if (!check[i])
                return false;
        }
        return true;
    }

    //Approach 2 : DFS
    private static boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        dfs(rooms, visited, 0);

        for (boolean check : visited) {
            if (!check)
                return false;
        }
        return true;
    }

    private static void dfs(List<List<Integer>> rooms, boolean[] visited, int currRoom) {
        visited[currRoom] = true;

        for (int key : rooms.get(currRoom)) {
            if (!visited[key]) {
                dfs(rooms, visited, key);
            }
        }
    }
}
