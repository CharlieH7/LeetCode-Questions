class Solution {
    public static int maxArea(int[] height) {
        // BRUTE FORCE Soltion
        // int maxArea = 0;
        // for (int left = 0; left < height.length; left++) {
        //     for (int right = left + 1; right < height.length; right++) {
        //         int area = (right - left) * Math.min(height[left], height[right]);
        //         maxArea = Math.max(area, maxArea);
        //     }
        // }
        // return maxArea;

        // Linear time Solution
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;

    }
    // public static void main(String[] args) {
    //     int[] height = {1,8,6,2,5,4,8,3,7};
    //     System.out.println(maxArea(height));
    // }
}