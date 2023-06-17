class NumArray {
    // declare an integer array to store numbers
    int[] nums;
    // constructor to initialize the array by copying the input array
    public NumArray(int[] nums) {
        // copy the elements from the input array to the newly created array
        this.nums = nums;
    }
    // method to calculate the sum of numbers in the given range
    public int sumRange(int left, int right)
    {
        // initialize a variable to store the sum of numbers 
        int sum = 0;
        // loop through the array from the left index to the right index
        while (left <= right)
        {
            // add current element to the sum
            sum += nums[left];
            // increment the left index to move to the next element
            left++;
        }
        // return the sum of numbers in the given range
        return sum;
    }
}