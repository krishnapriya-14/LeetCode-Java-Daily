//#6 Zigzag Conversion (Simulation, direction toggle)
//Concepts: build rows, flip direction at top/bottom.
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
    StringBuilder[] rows = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();
    int curRow = 0, step = 1;
    for (char c : s.toCharArray()) {
        rows[curRow].append(c);
        if (curRow == 0) step = 1;
        else if (curRow == numRows - 1) step = -1;
        curRow += step;
    }
    StringBuilder res = new StringBuilder();
    for (StringBuilder row : rows) res.append(row);
    return res.toString();
        
    }
}
