class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> bracketMap = new java.util.HashMap<>();
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        bracketMap.put(')', '(');      
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);           
            if (bracketMap.containsValue(c)) {
                stack.push(c);
            } else if (bracketMap.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != bracketMap.get(c)) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }

    }}
}