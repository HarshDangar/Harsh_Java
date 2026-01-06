import java.util.Arrays;

public class P1854 {
    public static void main(String[] args) {
        int[][] logs = {{2033, 2034}, {2039, 2047}, {1998, 2042}, {2047, 2048}, {2025, 2029}, {2005, 2044}, {1990, 1992}, {1952, 1956}, {1984, 2014}};
        System.out.println(maximumPopulation(logs));
    }

    public static int maximumPopulation(int[][] logs) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[0], b[0]));
        /*
        It is lambda expression to sort the array with value at zero index
        here a array = {2033,2034}
        and b array = {2039,2047}
        it compare its zero index if a[0] < b[0] then it returns -1
        equal so 0
        and greater than 1 mean positive
        */

        int bornYear;
        int maxPopulation = 0;
        int earliestYear = logs[0][0];

        for (int i = 0; i < logs.length; i++) {
            bornYear = logs[i][0];
            int population = 0;

            for (int j = 0; j < logs.length; j++) {
                if (logs[j][1] > bornYear && logs[j][0] <= bornYear) {
                    population++;
                }
            }

            if (population > maxPopulation) {
                earliestYear = bornYear;
                maxPopulation = population;
            }
        }
        return earliestYear;
    }
}
