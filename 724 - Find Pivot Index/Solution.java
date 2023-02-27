class Solution {
    public int pivotIndex(int[] nums) {
        // Initialize an array to store the running sum of elements to the left of the current index
        int[] sumLeft = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumLeft[i] = sum;
        }
        // Initialize an array to store the running sum of elements to the right of the current index
        int[] sumRight = new int[nums.length];
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            sumRight[i] = sum;
        }
        // Iterate through the array and check if the sum of elements to the left of the current index is equal to the sum of elements to the right of the current index
        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        // If no pivot index is found, return -1
        return -1;
    }
}