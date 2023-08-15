class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()

        for i, a in enumerate(nums):
            # Skip duplicate elements
            if i > 0 and a == nums[i-1]:
                continue
            # Set left and right pointers for the remaining elements
            left, right = i + 1, len(nums) - 1
            # While the pointers don't cross each other
            while left < right:
                # Calculate the sum of the triplet
                threeSum = a + nums[left] + nums[right]
                # If sum is greater than zero, move the right pointer to the left
                if threeSum > 0:
                    right -= 1
                # If sum is less than zero, move the left pointer to the right
                elif threeSum < 0:
                    left += 1
                else:
                    # If sum is zero, add the triplet to the result
                    result.append([a, nums[left], nums[right]])
                    # move both pointers
                    left += 1
                    right -= 1
                    # Skip duplicate elements while moving the left pointer
                    while nums[left] == nums[left - 1] and left < right:
                        left += 1
        return result
