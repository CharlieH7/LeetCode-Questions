class Solution {
    public boolean digitCount(String num) {
        // Iterate through the string
        for (int i = 0; i < num.length(); i++) {
            // Initialize count to 0
            int count = 0;
            // Count how many times the digit i occurs in the string
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == Character.forDigit(i, 10)) {
                    count++;
                }
            }
            // Compare the count to the numeric value of the character at index i
            if (count != Character.getNumericValue(num.charAt(i))) {
                // If the count does not match the numeric value, return false
                return false;
            }
        }
        // If the function completes the iteration, return true
        return true;
    }
}