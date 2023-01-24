class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int elem: nums){
            // check if current element is not equal to the given value
            if (elem != val){
                // if it's not equal, then assign it to the current index 
                nums[i] = elem;                
                // increment the index
                i++;
            }
        }
        // return the new length of the array
        return i;
    }
}