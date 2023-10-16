class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        # Intialize a dictionary to store the frequency of each character in the current window
        count = {}
        # Variable to store the result
        result = 0
        # Pointer to the left end of the current window
        left = 0
        # Variable to keep track of the character with maximum frequency in the current window

        # Traverse through the string with the right pointer
        for right in range(len(s)):
            # Update the count of the character at the current position of the right pointer
            count[s[right]] = count.get(s[right], 0)
            # Update the character with maximum frequency 
            maxf = max(maxf, count[s[right]])

            # Check if the number of characters we can change to get a string of the same character exceeds k
            # If yes, then shrink the window from the left
            while (right - left + 1) - maxf > k:
                count[s[left]] -= 1
                left += 1
            
            # Update the result with the maximum size of the window seen so far
            result = max(result, right - left + 1)
        
        return result