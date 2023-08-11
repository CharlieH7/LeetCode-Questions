import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
        // List to store separated digits
        List<Integer> separateDigits = new ArrayList<>();
        // Loop through each number in the nums array in reverse order
        for (int i = nums.length - 1; i >= 0; i--) {
            // Get the current number
            int n = nums[i];
            // Separate and store the digits of the current number
            while (n != 0) {
                // Extract the last digit
                int digit = n%10;
                // Add the digit to the list
                separateDigits.add(digit);
                // Remove the last digit
                n/=10;
            }
        }
        // Array to store the final result
        int[] results = new int[separateDigits.size()];
        // Copy the separated digits from the list to the array in correct order
        for (int i = 0; i < results.length; i++) {
            // Start filling from the end of the list, which corresponds to the beginning of the array
            results[i] = separateDigits.get(separateDigits.size()-1-i);
        }
        // Return the final array of separated digits
        return results;
    }
}