class Solution {
    public boolean isPalindrome(int x) {
        // Convert the integer to a string
        String numStr = String.valueOf(x);

        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = numStr.length() - 1;

        // Compare characters from the start and end of the string
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true;
    }
}
