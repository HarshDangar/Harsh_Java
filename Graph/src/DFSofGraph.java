import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFSofGraph {
    //https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2,3,1)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(Arrays.asList(0,4)));
        adj.add(new ArrayList<>(List.of(0)));
        adj.add(new ArrayList<>(List.of(2)));
        System.out.println(dfs(adj));
    }

    private static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();

        boolean[] visited = new boolean[adj.size()];

        DFS(adj, 0, visited, result);
        return result;
    }

    private static void DFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, ArrayList<Integer> result) {
        if (visited[u])
            return;

        visited[u] = true;
        result.add(u);

        for (int i = 0; i < adj.get(u).size(); i++) {
            int v = adj.get(u).get(i);
            if (!visited[v]) {
                DFS(adj, v, visited, result);
            }
        }
    }
}
