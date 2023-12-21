class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        // Initialize counters for each letter in "croak"
        int c=0, r=0, o=0, a=0;
        // Initialize the return value
        int ret = 0;

        // Iterate through the characters in the input string
        for (int i = 0; i < croakOfFrogs.length(); ++i) {
            // Check if the current character is 'c'
            if (croakOfFrogs.charAt(i) == 'c') {
                c++;
            }
            // Check if the current character is 'r'
            else if (croakOfFrogs.charAt(i) == 'r') {
                // Decrease 'c' count
                c--;
                // Increase 'r' count
                r++;
                // Check if 'c' count becomes negative (invalid order)
                if (c < 0) return -1;
            }
            // Check if the current character is 'o'
            else if (croakOfFrogs.charAt(i) == 'o') {
                // Decrease 'r' count
                r--;
                // Increase 'o' count
                o++;
                // Check if 'r' count becomes negative (invalid order)
                if (r < 0) return -1;
            }
            // Check if the current character is 'a'
            else if (croakOfFrogs.charAt(i) == 'a') {
                // Decrease 'o' count
                o--;
                // Increase 'a' count
                a++;
                // Check if 'o' count becomes negative (invalid order)
                if (o < 0) return -1;
            }
            // Check if the current character is 'k'
            else if (croakOfFrogs.charAt(i) == 'k') {
                // Decrease 'a' count
                a--;
                // Check if 'a' count becomes negative (invalid order)
                if (a < 0) return -1;
            }
            // Update the maximum count of any letter encountered so far
            ret = Math.max(ret, c+r+o+a);
        }

        // Check if there are remaining unclosed letters at the end
        if (c+r+o+a > 0) return -1;

        // Return the maximum count of any letter encountered
        return ret;
    }
}
