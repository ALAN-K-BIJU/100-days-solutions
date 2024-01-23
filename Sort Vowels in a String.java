class Solution {
    public String sortVowels(String s) {
        char[] chars = s.toCharArray();
        StringBuilder vowels = new StringBuilder();
        for (char c : chars) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels.append(c);
            }
        }
        char[] sortedVowels = vowels.toString().toCharArray();
        Arrays.sort(sortedVowels);
        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;
        for (char c : chars) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                result.append(sortedVowels[vowelIndex++]);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
