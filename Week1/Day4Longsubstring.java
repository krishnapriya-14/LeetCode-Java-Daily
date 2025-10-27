//Day 4 — #3 Longest Substring Without Repeating Characters (Sliding window)
//Concepts: sliding window, last-seen index map (ASCII array), move left pointer smartly.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] lastIndex = new int[128]; 
        for (int i = 0; i < 128; i++) lastIndex[i] = -1;
        int max = 0, start = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;    
            }
            lastIndex[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}

        
    
