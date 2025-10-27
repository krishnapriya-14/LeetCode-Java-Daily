//#14 Longest Common Prefix (Prefix shrink)
//Concepts: take first string as prefix, shrink until all start with it.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
for (int i = 1; i < strs.length; i++) {
    while (strs[i].indexOf(prefix) != 0)
        prefix = prefix.substring(0, prefix.length() - 1);
}
return prefix;

        
    }
}
