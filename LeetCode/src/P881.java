import java.util.Arrays;

public class P881 {
    public static void main(String[] args) {
        int[] people = {4, 2, 9, 6};
        int limit = 10;
        System.out.println(numRescueBoats(people, limit));
    }

    private static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        int boats = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            boats += 1;
            j--;
        }
        return boats;
    }
}
