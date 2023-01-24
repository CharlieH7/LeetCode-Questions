class Solution:
    def twoSum(self, nums: List[int], targer: int) -> List[int]:
        # val : index
        prevMap = {}
        # iterate over the nums list, if the different exist in the dictionary then return its indices, if it doesn't then put it in the dictionary and look for the next element
        for i, n in enumerate(nums):
            diff = targer - n
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i
        # return none if no elements found
        return None
