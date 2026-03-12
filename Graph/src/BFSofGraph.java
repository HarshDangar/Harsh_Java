import java.util.*;

public class BFSofGraph {
    //https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2,3,1)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(Arrays.asList(0,4)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(2)));
        System.out.println(bfs(adj));
    }

    private static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();

        boolean[] visited = new boolean[adj.size()];

        BFS(adj, 0, visited, result);
        return result;
    }

    private static void BFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, ArrayList<Integer> result) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(u);
        visited[u] = true;
        result.add(u);

        while (!queue.isEmpty()) {
            u = queue.peek();
            queue.remove();

            for (int i = 0; i < adj.get(u).size(); i++) {
                int v = adj.get(u).get(i);
                if (!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                    result.add(v);
                }
            }
        }
    }
}
