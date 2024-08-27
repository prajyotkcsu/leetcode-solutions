import java.util.ArrayList;
import java.util.List;

public class CombinationArray {

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = {1, 2, 3};
        backtrack(res, nums, 0, new ArrayList<>());
        System.out.println(res);
    }

    static void backtrack(List<List<Integer>> res, int[] nums, int start, List<Integer> combo) {
        res.add(new ArrayList<>(combo));
        for (int i = start; i < nums.length; i++) {
            combo.add(nums[i]);
            backtrack(res, nums, i + 1, combo);
            combo.removeLast();
        }
    }
}
