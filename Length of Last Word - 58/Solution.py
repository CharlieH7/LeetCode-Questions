class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        # i will be intialially set to end of the string (index), length set to 0
        i, length = len(s) - 1, 0

        # while the character at index i is equal to whitespace, we are be gonna shifting our pointer back
        while s[i] == " ":
            i -= 1
        # while the character at index i is not a space
        while i >= 0 and s[i] != " ":
            length += 1
            i -= 1
        return length