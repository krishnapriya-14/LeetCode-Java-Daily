//22. Generate Parentheses
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] path = new char[2 * n];
        backtrack(0, 0, 0, n, path, ans);
        return ans;
    }

    // i = position; open = '(' used; close = ')' used
    private void backtrack(int i, int open, int close, int n, char[] path, List<String> ans) {
        if (i == 2 * n) { ans.add(new String(path)); return; }
        if (open < n) {                 // place '('
            path[i] = '(';
            backtrack(i + 1, open + 1, close, n, path, ans);
        }
        if (close < open) {             // place ')' only if it stays valid
            path[i] = ')';
            backtrack(i + 1, open, close + 1, n, path, ans);
        }

    }
}
