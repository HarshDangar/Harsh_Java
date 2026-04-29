import java.util.HashSet;

public class P991 {
    public static void main(String[] args) {
        int startValue = 3, target = 10;
        System.out.println(brokenCalc(startValue, target));
    }

    private static int brokenCalc(int startValue, int target) {
        if (startValue >= target)
            return startValue - target;

        //target is even
        if (target % 2 == 0) {
            return 1 + brokenCalc(startValue, target / 2);
        }
        //target is odd number so we add +1 in the target
        return 1 + brokenCalc(startValue, target + 1);
    }
}
