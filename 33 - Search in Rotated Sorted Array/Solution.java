class Solution {
    public int search(int[] nums, int target) {
        // Initialize pointers for binary search
        int l = 0;
        int r = nums.length-1;
        
        // Perform binary search
        while (l <= r) {
            // Calculate middle index
            int m = (l+r)/2;

            // Check if middle index is target
            if (nums[m] == target) {
                return m;
            }

            // Check if the left portion is sorted
            if (nums[l] <= nums[m]) {
                // Check if the target is in the left sorted portion
                if (target > nums[m] || target < nums[l]) {
                    // Adjust left pointer accordingly
                    l = m+1;
                } else {
                    // Adjust right pointer accordingly
                    r = m-1;
                }
            }

            // Check if the right portion is sorted
            else {
                // Check if the target is in the right sorted portion
                if (target < nums[m] || target > nums[r]) {
                    // Adjust right pointer accordingly
                    r = m-1;
                } else {
                    // Adjust left pointer accordingly
                    l = m+1;
                }
            }
        }
        // Target not found
        return -1;
    }
}