class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # dictionaries to store the mapping of each character in the strings
        mapST, mapTS = {}, {}

        for i in range(len(s)):
            c1, c2 = s[i], t[i]  # mapping characters in s and t

            if ((c1 in mapST and mapST[c1] != c2) or  # if mapping is inconsistent
                    (c2 in mapTS and mapTS[c2] != c1)):
                return False  # return False if inconsistent
            mapST[c1] = c2  # store the mapping in mapST
            mapTS[c2] = c1  # store the mapping in mapTS
        return True  # if the loop completes, it means that the two strings are isomorphic and the function returns True
