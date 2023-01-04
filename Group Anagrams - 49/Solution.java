// import necessary packages
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        // Create an empty list called "result" that will eventually hold the list of lists of anagrams
        List<List<String>> result = new ArrayList<List<String>>();

        // Create a map that maps strings (sorted letters of anagrams) to lists of strings
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        // Iterate over each string in the input array
        for (int i = 0; i < strs.length; i++)
        {
            // Sort the letters in the string
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);

            // Convert the sorted string to a key
            String key = new String(sorted);

            // If the key is not in the map, add a new entry to the map with the key and an empty list as the value
            if (!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }

            // add the current string to the list of strings mapped to the key in the map
            map.get(key).add(strs[i]);
        }
        // Return the values in the mpa (which are the lists of anagrams) as a list
        result = new ArrayList<>(map.values());
        return result;
    }
}
