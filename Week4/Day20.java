//20. Valid Parentheses
class Solution {
    public boolean isValid(String s) {
                Deque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char open = st.pop();
                if ((open == '(' && c != ')') ||
                    (open == '{' && c != '}') ||
                    (open == '[' && c != ']')) return false;
            }
        }
        return st.isEmpty();

    }
}
