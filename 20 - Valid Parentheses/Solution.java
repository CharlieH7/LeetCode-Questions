import java.util.HashMap;

class Solution {
    // This method checks whether the given string 's' contains valid paris of parentheses, brackets, and curly braces.
    public boolean isValid(String s) {
        // Stack to keep tract of open parentheses, brackets, and curly braces.
        Stack<Character> stack = new Stack<Character>();

        // HashMap to store the mapping of closing and opening characters
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is a closing character
            if (closeToOpen.containsKey(s.charAt(i))) {
                // If the stack is not empty and the top of the stack matches the corresponding opening character,
                // pop the top of the stack.
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    // Otherwise, return false.
                    return false;
                }
            } 
            // Otherwise, push the current character onto the stack.
            else {
                stack.push(s.charAt(i));
            }
        }
        // After iterating through the entire string, the string is valid if and only if the stack is empty
        return stacks.empty();
    }
}