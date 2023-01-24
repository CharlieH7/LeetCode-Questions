import java.util.*; 
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int spaceApart = 0;
        int countOne = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // for each integer in the array, if the number equals to 0 then add 1 to spaceApart variable, 
        // otherwise add 1 to countOne variable if number equals to 1 and store the number of spaces into the arr arraylist,
        // make the spaceApart back to 0 once encounter another 1
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

        // return true if the number of 1's is less than 2 
        if(countOne < 2)
        {
            return true;
        }

        // sort the arrayList in ascending order
        Collections.sort(arr);
        // remove the first digit in the arrayList, since it is 0, because the array always start with 1
        arr.remove(0);

        // finding the minimum in the arrayList
        int minimum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (minimum > arr.get(i))
            {
                minimum = arr.get(i);
            }  
        }

        // return true if the minimum spaceApart in the arraylist is greater than or equal to the given parameter
        if(minimum >= k)
        {
            return true;
        }
        return false;
    }
}