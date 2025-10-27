// #4 Median of Two Sorted Arrays (Binary-search partition)
//Concepts: partition two arrays so left-max ≤ right-min; handle edges with sentinels.
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A= nums1;
        int[] B = nums2;
        if (A.length > B.length) return findMedianSortedArrays(B, A);
    int m = A.length, n = B.length, half = (m + n + 1) / 2;
    int l = 0, r = m;
    while (l <= r) {
        int i = (l + r) / 2, j = half - i;
        if (i < m && A[i] < B[j - 1]) l = i + 1;
        else if (i > 0 && A[i - 1] > B[j]) r = i - 1;
        else {
            int maxLeft = (i == 0) ? B[j - 1] : (j == 0 ? A[i - 1] : Math.max(A[i - 1], B[j - 1]));
            if ((m + n) % 2 == 1) return maxLeft;
            int minRight = (i == m) ? B[j] : (j == n ? A[i] : Math.min(A[i], B[j]));
            return (maxLeft + minRight) / 2.0;
        }
    }
    return 0.0;
        
    }
}
