class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Intialise the left pointer of the sliding window
        int left = 0;
        // Intialise the right pointer of the sliding window
        int right = 0;
        // Intialise the maximum substring length
        int max = 0;
        // Create a HashSet of store unique characters in the current substring
        HashSet<Character> hashSet = new HashSet<Character>();

        // Iterating through the string
        while (right < s.length()) {
            // If the character at 'right' is not in the HashSet, it's a new unqiue
            // character
            if (!hashSet.contains(s.charAt(right))) {
                // Add it to the HashSet
                hashSet.add(s.charAt(right));
                // Move the 'right' pointer to the right to expand the current substring
                right++;
                // Update 'max' with the maximum length encountered so far
                max = Math.max(hashSet.size(), max);
            }
            // If the character at 'right' is already in the HashSet, it's a duplicate
            // character
            else {
                // Remove the character at 'left' from the Hashset to shrink the substring
                hashSet.remove(s.charAt(left));
                // Move the 'left' pointer to the right to create a new substring without the
                // duplicate character
                left++;
            }
        }
        return max;
    }
}