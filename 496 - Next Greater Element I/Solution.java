// import java.util.Arrays;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        // loop through nums1 array starting from index 0
        for (int i = 0; i < nums1.length; i++)
        {
            boolean found = false;
            // loop through nums2 array starting from index 0
            for (int j = 0; j < nums2.length; j++)
            {
                // compare nums1 array from first element to last in respective to nums2 array
                if (nums1[i] == nums2[j])
                {
                    found = true;
                    // look for next greater element
                    for (int k = j + 1; k < nums2.length; k++)
                    {
                        if (nums2[k] > nums1[i])
                        {
                            result[i] = nums2[k];
                            break;
                        }
                    }
                    // If next greater element is not found set result[i] to -1
                    if (result[i] == 0)
                    {
                        result[i] = -1;
                    }
                    break;
                }         
            }
            if (!found)
            {
                result[i] = -1;
            }
        }
        return result;
    }
    // public static void main(String[] args)
    // {
    //     Solution s = new Solution();
    //     int[] a = {4,1,2};
    //     int[] b = {1,3,4,2};
    //     System.out.println(Arrays.toString(s.nextGreaterElement(a,b)));
    // }
}