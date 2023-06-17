class Solution {
    public int removeDuplicates(int[] nums) {
        // initialize the swap pointer to 1, since the first element is already unique
        int swap = 1; 
        // iterate through the array starting from the second element
        for(int i=1; i<nums.length; i++) { 
            // if the current element is not equal to the previous element
            if(nums[i] != nums[i-1]) { 
                // overwrite the element at the current swap pointer with the current element
                nums[swap] = nums[i]; 
                // increment the swap pointer
                swap++; 
            }
        }
        // return the final length of the array, which is equal to the swap pointe
        return swap; 
    }
}
