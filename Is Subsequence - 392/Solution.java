class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            // If the current character in s matches the current character in t,
            // move to the next character in both s and t
            if (s.charAt(i) == t.charAt(i)) {
                i++;
                j++;
            } else {
                // If the current character in s does not match the current character in t,
                // move to the next character in t
                j++;
            }
        }
        // If we have reached the end of s, then all of its characters have been matched
        // in t,
        // so s is a subsequence of t.
        return s.length() == i;
    }

    public static void main(String[] args)
    {
        String s = "axc";
        String t = "abcde";
        Solution s1 = new Solution();
        boolean isSubsequence = s1.isSubsequence(s, t);
        System.out.println(isSubsequence);
    }
}