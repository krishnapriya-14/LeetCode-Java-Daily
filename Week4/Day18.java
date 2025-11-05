//17. Letter Combinations of a Phone Number
class Solution {
    private static final String[] MAP = {
        "", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return List.of("");
        List<String> res = List.of("");
        for (char d : digits.toCharArray()) {
            String letters = MAP[d - '0'];
            res = res.stream()
                     .flatMap(prefix -> letters.chars()
                        .mapToObj(c -> prefix + (char)c))
                     .collect(Collectors.toList());
        }
        return res.equals(List.of("")) ? List.of() : res;
    }
}
