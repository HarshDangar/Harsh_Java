public class P547 {
    public static void main(String[] args) {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(isConnected));
    }

    private static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int provinces = 0;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                provinces++;
            }
        }
        return provinces;
    }

    private static void dfs(int city, int[][] isConnected, boolean[] visited) {
        visited[city] = true;

        for (int i = 0; i < isConnected[city].length; i++) {
            if (!visited[i] && isConnected[city][i] == 1) {
                dfs(i, isConnected, visited);
            }
        }
    }
}
