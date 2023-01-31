class Solution {
    public boolean isIsomorphic(String s, String t) {
        // First, we check if the lengths of the two strings are equal. If not, they are
        // not isomorphic, so we return false.
        if (s.length() != t.length()) {
            return false;
        }
        // we create two arrays mapS and mapT of size 128 to store the mapping between
        // characters in the two strings.
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        // For each character in s and t, we compare the mapping stored in the arrays.
        // If they are different, the strings
        // are not isomorphic, so we return false. If they are the same, we set the
        // mapping for the current character in the
        // arrays to its index in the string plus one.
        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            if (mapS[cS] != mapT[cT]) {
                return false;
            } else {
                mapS[cS] = i + 1;
                mapT[cT] = i + 1;
            }
        }
        // Finally, we return true if all characters have been processed successfully,
        // indicating that the strings are isomorphic.
        return true;
    }
}