class Solution {
    public String longestCommonPrefix(String[] strs) {
        // For each string, it compares it to the common prefix and updates the common
        // prefix to be the common prefix of the current string and the current value of
        // the common prefix.
        // It does this by repeatedly removing the last character from the common prefix
        // until it is a prefix of the current string or the common prefix becomes
        // empty.
        // If the common prefix becomes empty, it returns an empty string. Otherwise, it
        // returns the common prefix.
        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                if (commonPrefix.isEmpty()) {
                    return "";
                }
            }
        }
        return commonPrefix;
    }
}