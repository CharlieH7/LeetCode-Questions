class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # Initialize two variables: result is the current majority element,
        # count is the number of occurrences of the majority element so far
        result, count = 0, 0

        # Loop over each element in the list
        for num in nums:
            # If count is 0, we assume the current element is the majority element
            if count == 0:
                result = num
            # Update count: add 1 if num is the same as result, subtract 1 otherwise
            count += (1 if num == result else -1)

        # Return the majority element
        return result
