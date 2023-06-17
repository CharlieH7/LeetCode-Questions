#include <iostream>
#include <vector>
class Solution
{
public:
    vector<int> getConcatenation(vector<int> &nums)
    {
        std::vector<int> copy = nums;
        nums.insert(nums.end(), copy.begin(), copy.end());
        return nums;
    }
};