//#16 3Sum Closest (Reuse 3Sum skeleton; minimize |sum-target|)
//Concepts: track best difference; move pointers by comparison with target.
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int s = nums[i] + nums[l] + nums[r];
                if (Math.abs(s - target) < Math.abs(closest - target)) {
                    closest = s;
                }
                if (s < target) l++;
                else if (s > target) r--;
                else return target; // exact hit
            }
        }
        return closest;
        
    }
}
