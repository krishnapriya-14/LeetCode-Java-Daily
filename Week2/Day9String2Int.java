//#8 String to Integer (atoi) (Parsing, clamping)
//Concepts: trim, sign, digits, early clamp to 32-bit range.
class Solution {
    public int myAtoi(String s) {
        int i=0, sign=1, n=s.length(); long num=0;
while(i<n && s.charAt(i)==' ') i++;
if(i<n && (s.charAt(i)=='+'||s.charAt(i)=='-')) sign=s.charAt(i++)=='-'?-1:1;
while(i<n && Character.isDigit(s.charAt(i))){
  num = num*10 + (s.charAt(i++)-'0');
  if(sign*num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
  if(sign*num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
}
return (int)(sign*num);

        
    }
}
