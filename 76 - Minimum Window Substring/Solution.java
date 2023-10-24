import java.util.HashMap;

class Solution {
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         String s = "ADOBECODEBANC";
//         String t = "ABC";
//         String result = solution.minWindow(s, t);
//         System.out.println(result);
//     }
    public String minWindow(String s, String t) {
        // Create a HashMap to store the characters in t and their frequency
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Populate the HashMap with the characters in t
        for (char x: t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Intialize variables for tracking the matching window
        int matched = 0;
        int start = 0;
        int minLen = s.length() + 1;
        int subStr = 0;

        // Iterate through the characters in string s
        for (int endWindow = 0; endWindow < s.length(); endWindow++) {
            char rightChar = s.charAt(endWindow);

            // If the character is in the HashMap, decrement its frequency
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);

                // If the frequency of the character is 0, we have a match
                if (map.get(rightChar) == 0) {
                    matched++;
                }
            }

            // If we have a match, we can try to shrink the window
            while (matched == map.size()) {
                // If the current window is smaller than the minimum window, update the minimum window
                if (minLen > endWindow - start + 1) {
                    minLen = endWindow - start + 1;
                    subStr = start;
                }

                // Shrink the window by incrementing the start pointer
                char deleted = s.charAt(start++);
                if (map.containsKey(deleted)) {
                    // If the frequency of the character is 0, we no longer have a match
                    if (map.get(deleted) == 0) {
                        matched--;
                    }
                    // Increment the frequency of the character
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }
        // Return the minimum window substring if it exists, otherwise return an empty string
        return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
    }
}