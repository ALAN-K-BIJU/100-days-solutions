class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String str : strs) {
            int[] charCount = new int[26];
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append(count).append("#");
            }
            String key = keyBuilder.toString();
            anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramGroups.values());
    }
}