//Day 1 — #1 Two Sum (Arrays, HashMap)
//Concepts: brute force → optimize with HashMap (O(n) lookups), complements, indices.// Time: O(n) | Space: O(n)
// Idea: Scan once, store seen values with their index. For each x, look for (target - x).
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> seen = new HashMap<>(); 
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (seen.containsKey(complement)) {
            return new int[] { seen.get(complement), i };
        }
        seen.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
    }
