//Day 6 — #7 Reverse Integer (Math, overflow checks)
//Concepts: pop/push digits, guard 32-bit overflow before multiplying by 10.
class Solution {
    public int reverse(int x) {
        int rev = 0;
while (x != 0) {
    int pop = x % 10;
    x /= 10;
    if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) return 0;
    rev = rev * 10 + pop;
}
return rev;
        

    }
}
