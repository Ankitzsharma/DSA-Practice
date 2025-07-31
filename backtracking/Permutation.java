package backtracking;
import java.util.ArrayList;
import java.util.List;
// Question: Given an array nums of distinct integers, return all possible permutations of the array.
// Example: 
// Input: nums = [1,2,3]
// Output: [
//   [1,2,3],
//   [1,3,2],
//   [2,1,3],
//   [2,3,1],
//   [3,1,2],
//   [3,2,1]
// ]
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // Skip if already used
            used[i] = true; // Mark as used
            current.add(nums[i]); // Add to current permutation
            backtrack(nums, used, current, result); // Recur
            current.remove(current.size() - 1); // Backtrack
            used[i] = false; // Unmark
        }
    }
    public static void main(String[] args) {
        Permutation perm = new Permutation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = perm.permute(nums);
        System.out.println("Permutations: " + result);
    }

    
}
