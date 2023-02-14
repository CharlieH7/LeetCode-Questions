class Solution():
    def isSubsequence(self, s: str, t: str) -> bool:
        i, j = 0, 0

        while i < len(s) and j < len(t):
            #  If the current character in s matches the current character in t,
            #  move to the next character in both s and t
            if s[i] == t[j]:
                i += 1
                j += 1
            #  If the current character in s does not match the current character in t,
            #  move to the next character in t
            else:
                j += 1

        # If we have reached the end of s, then all of its characters have been matched
        # in t,
        # so s is a subsequence of t.
        return i == len(s)
