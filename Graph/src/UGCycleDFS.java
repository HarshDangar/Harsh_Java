import java.util.ArrayList;

public class UGCycleDFS {
    //https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1

    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        System.out.println(isCycle(V, edges));
    }

    private static boolean isCycle(int V, int[][] edges) {
        boolean[] visited = new boolean[edges.length];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge: edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        for (int i = 0; i < V; i++) {
            if (!visited[i] && isCycleDFS(adj, i, visited, -1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, int parent) {
        visited[u] = true;

        for (int i = 0; i < adj.get(u).size(); i++) {
            int v = adj.get(u).get(i);
            if (v == parent)
                continue;

            if (visited[v])
                return true;

            if (isCycleDFS(adj, v, visited, u)) {
                return true;
            }
        }
        return false;
    }
}
