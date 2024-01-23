class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        int lastIndex = s.length() - 1;
        for (int i = lastIndex; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break; 
            }
            length++;
        }
        return length;
    }
}