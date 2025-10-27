//Day 2 — #9 Palindrome Number (Math, two pointers on digits)
//Concepts: reverse only half (avoid overflow + string conversion), handle negatives and trailing zero.
class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
