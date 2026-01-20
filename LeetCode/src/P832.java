public class P832 {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ans = flipAndInvertImage(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image.length];
        int[][] ans = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                arr[i][j] = image[i][image.length - j - 1];
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                if (arr[i][j] == 0) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = 0;
                }
            }
        }
        return ans;
    }
}
