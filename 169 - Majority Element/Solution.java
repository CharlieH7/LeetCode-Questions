class Solution {
    public int majorityElement(int[] nums) {
        // Using the Boyer-Moore Voting Algorithm, essentioally counting instances of the majority element as +1 and instances of any  other element as −1, summing them would make it obvious that the majority element is indeed the majority element.
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}