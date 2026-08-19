public class P4024 {
    public static void main(String[] args) {
        int[][] drones = {{0, 0, 8}, {2, 2, 9}};
        int[] target = {3, 4};
        System.out.println(nearestDrone(drones, target));
    }

    private static int nearestDrone(int[][] drones, int[] target) {
        int ans = -1;
        int index = 0;
        int minSum = Integer.MAX_VALUE;

        for (int[] drone : drones) {
            int sum = Math.abs(drone[0] - target[0]) + Math.abs(drone[1] - target[1]);
            int range = drone[2];
            if (sum <= range && sum < minSum) {
                ans = index;
                minSum = sum;
            }
            index++;
        }
        return ans;
    }
}
