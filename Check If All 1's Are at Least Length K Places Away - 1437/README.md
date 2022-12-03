Given an binary array nums and an integer k, return true if all 1's are at least k places away from each other, otherwise return false.

 

Example 1:

![image](https://user-images.githubusercontent.com/48937488/205442916-e567bf23-acc5-4a3b-88c9-7cd090021a4a.png)


Input: nums = [1,0,0,0,1,0,0,1], k = 2

Output: true
Explanation: Each of the 1s are at least 2 places away from each other.

Example 2:

![image](https://user-images.githubusercontent.com/48937488/205442920-0862baf6-a3fd-4b09-a530-792a14263b62.png)


Input: nums = [1,0,0,1,0,1], k = 2

Output: false
Explanation: The second 1 and third 1 are only one apart from each other.
 

Constraints:

1 <= nums.length <= 105
0 <= k <= nums.length
nums[i] is 0 or 1
