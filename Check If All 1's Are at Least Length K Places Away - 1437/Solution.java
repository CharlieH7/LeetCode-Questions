import java.util.*; 
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int spaceApart = 0;
        int countOne = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        for(int num: nums)
        {
            if (num == 0)
            {
                spaceApart++;
            }
            if (num == 1)
            {
                countOne++;
                arr.add(spaceApart);
                spaceApart = 0;
            }
        }
        if(countOne < 2)
        {
            return true;
        }
        Collections.sort(arr);
        arr.remove(0);
        // System.out.println(arr);
        int minimum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (minimum > arr.get(i))
            {
                minimum = arr.get(i);
            }  
        }
        if(minimum >= k)
        {
            return true;
        }
        return false;
    }
}