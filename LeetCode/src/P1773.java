import java.util.Arrays;
import java.util.List;

public class P1773 {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "phone"),
                Arrays.asList("phone", "gold", "iphone")
        );
        System.out.println(countMatches(items, "type", "phone"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;

        if (ruleKey.equals("color"))
            index = 1;
        else if (ruleKey.equals("name"))
            index = 2;

        int count = 0;

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
