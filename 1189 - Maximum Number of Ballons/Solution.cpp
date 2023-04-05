#include <unordered_map>
#include <string>
class Solution:
public:
    int maxNumberOfBallons(string text) {
        // Create a hash table to store the frequency of each character in the string
        std::unordered_map<char, int> freq;
        // Iterate through the string and store the frequency of each character
        for (int i = 0; i < (int) text.size(); i++)
        {
            // increment the count for each character in the text string
            freq[text[i]]++; 
        }
        // Define the word "balloon" and initialize the minimum count to INT_MAX
        string s = "balloon";
        int min_count = INT_MAX;
        
        // Iterate over each character in the word "balloon"
        for (int j = 0; j < (int) s.size(); j++)
        {
            // check if the character is present in the hash table
            if (freq.find(s[j]) != freq.end()) 
            {
                // Calculate the count of the current character and update the minimum count if necessary
                // divide by 2 for 'l' and 'o'
                int count = freq[s[j]] / (s[j] == 'l' || s[j] == 'o' ? 2 : 1); 
                // update the minimum count
                min_count = min(min_count, count); 
            }
            // the character is not present in the hash table, so we can't form the word "balloon"
            else 
            {
                return 0; 
            }
        }
        // Return the minimum count of all the characters in the word "balloon"
        return min_count;
    }
};
