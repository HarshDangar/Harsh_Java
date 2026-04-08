import java.util.Arrays;

public class P948 {
    public static void main(String[] args) {
        int[] tokens = {100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens, power));
    }

    private static int bagOfTokensScore(int[] tokens, int power) {
        int maxScore = 0; //Initial score
        int n = tokens.length;
        Arrays.sort(tokens);

        int i = 0;
        int j = n - 1;

        int score = 0;
        while (i <= j) {
            if (power >= tokens[i]) { //Face up
                power -= tokens[i];
                score += 1;
                i++;
                maxScore = Integer.max(maxScore, score);
            } else if (score >= 1) { //Face down
                power += tokens[j];
                score -= 1;
                j--;
            } else {
                return maxScore;
            }
        }

        return maxScore;
    }
}
