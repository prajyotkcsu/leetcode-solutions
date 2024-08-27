import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> result = new ArrayList<>();
    static int[] candidates = {2, 4, 5};

    public static void main(String[] args) {
        List<Integer> currentCombo = new ArrayList<>();
        int target = 10;
        Arrays.sort(candidates);
        backtrack(0, currentCombo, target);
        System.out.println(result);
    }

    static void backtrack(int start, List<Integer> currentCombo, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombo));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            currentCombo.add(candidates[i]);
            backtrack(i, currentCombo, target - candidates[i]);
            currentCombo.removeLast();
        }
    }
}
