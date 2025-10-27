//#18 4Sum (Sort, two loops + two pointers, dedupe, long math)
//Concepts: generalize 3Sum: fix two indices, two-pointer the rest; watch overflow.
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; 

                int l = j + 1, r = n - 1;
                long need = (long)target - nums[i] - nums[j];

                while (l < r) {
                    long two = (long)nums[l] + nums[r];
                    if (two == need) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        int bl = nums[l], br = nums[r];
                        while (l < r && nums[l] == bl) l++;
                        while (l < r && nums[r] == br) r--;
                    } else if (two < need) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res;

    }
}
