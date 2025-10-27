//#15 3Sum (Sort + two pointers + dedupe)
//Concepts: fix i, scan with l,r, skip duplicates at each step.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 
            int l = i + 1, r = n - 1;
            while (l < r) {
                int s = nums[i] + nums[l] + nums[r];
                if (s == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                   
                    int bl = nums[l], br = nums[r];
                    while (l < r && nums[l] == bl) l++;
                    while (l < r && nums[r] == br) r--;
                } else if (s < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}

  

        
 
