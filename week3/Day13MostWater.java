//#11 Container With Most Water (Two pointers, greedy)
//Concepts: area = width * min(height[left], height[right]); move the shorter wall.
class Solution {
    public int maxArea(int[] height) {
  int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;

    } 
   
}
