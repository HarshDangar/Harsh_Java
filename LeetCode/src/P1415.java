import java.util.ArrayList;
import java.util.List;

public class P1415 {
    public static void main(String[] args) {
        System.out.println(getHappyString(3, 9));
        System.out.println(getHappyString2(3, 9));
    }

    private static String getHappyString(int n, int k) {
        //First approach
        StringBuilder curr = new StringBuilder();
        List<String> result = new ArrayList<>();

        solve(n, curr, result);
        if (result.size() < k)
            return "";
        return result.get(k - 1);
    }

    //Better approach
    private static String getHappyString2(int n, int k) {
        StringBuilder curr = new StringBuilder();
        String[] result = {""};
        int[] count = {0};

        solve(n, curr, count, k, result);

        return result[0];
    }

    //Here we are storing every happy string and there after returning the answer
    private static void solve(int n, StringBuilder curr, List<String> result) {
        if (curr.length() == n) {
            result.add(curr.toString());
            return;
        }

        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (!curr.isEmpty() && curr.charAt(curr.length() - 1) == ch)
                continue;

            curr.append(ch);

            //Explore
            solve(n, curr, result);

            //Backtrack
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    //Better approach after getting kth happy string we stop and return answer
    private static void solve(int n, StringBuilder curr, int[] count, int k, String[] result) {
        if (curr.length() == n) {
            count[0]++;
            if (count[0] == k)
                result[0] = curr.toString();
            return;
        }

        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (!curr.isEmpty() && curr.charAt(curr.length() - 1) == ch)
                continue;

            curr.append(ch);

            //Explore
            solve(n, curr, count, k, result);

            //If result is found
            if (!result[0].isEmpty())
                return;

            //Backtrack
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
