//#13 Roman to Integer (Left-to-right, subtractive pairs)
//Concepts: if current < next → subtract; else add.
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
 'I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
int total = 0;
for (int i = 0; i < s.length(); i++) {
    int val = map.get(s.charAt(i));
    if (i+1 < s.length() && val < map.get(s.charAt(i+1))) total -= val;
    else total += val;
}
return total;
