import java.util.HashSet;
class Solution {
    public int longestConsectuive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        int longest = 0;
        // add all numbers to set
        for (int n : nums) {
            numSet.add(n);
        }
        for (int n : nums) {
            // check if its start of a sequence
            if (!(numSet.contains(n-1))) {
                int length = 0;
                while (numSet.contains(n + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}