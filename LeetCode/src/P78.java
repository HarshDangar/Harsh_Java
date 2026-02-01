import java.util.ArrayList;
import java.util.List;

public class P78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    private static List<List<Integer>> subsets(int[] nums) {
        //In the note prime red book page no 50
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : nums) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                //Here this internal list is copy of outer list with index at position i
                internal.add(num);
                //Now we have added the element in the list we have to add this answer in the outer list which is answer for the problem
                outer.add(internal);
            }
        }
        return outer;
    }
}
