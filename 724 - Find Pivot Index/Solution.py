class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        # calculate the total sum of all elements in the input list
        total = sum(nums)
        # initialize the sum of elements to the left of the current element to zero
        left_sum = 0
        for i in range(len(nums)):
            right_sum = total - left_sum - nums[i]
            if left_sum == right_sum:
                return i
            left_sum += nums[i]
        return -1
