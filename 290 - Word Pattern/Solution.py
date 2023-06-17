class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Split the words in a by spaces and store them in a list called words
        words = s.split(' ')
        # If the length of the pattern and the length of the words list are not equal, return False
        if len(pattern) != len(words):
            return False
        # intialise two hashmap to map characters in pattern to words in s and vice versa
        char_to_word = {}
        word_to_char = {}
        # Itrerate through both pattern and words simultaneously using zip() function:
        for c, w in zip(pattern, words):
            # If a character in pattern is already mapped to a different word than the current word, return False
            if c in char_to_word and char_to_word[c] != w:
                return False
            # If a word in s is already mapped to a different character than the current character, return False
            if w in word_to_char and word_to_char[w] != c:
                return False
            # If a character in pattern is not mapped to a word in s, map it to the current word
            if c not in char_to_word:
                char_to_word[c] = w
            # If a word in s is not mapped to a character in pattern, map it to the current character
            if w not in word_to_char:
                word_to_char[w] = c
        # If all the above conditions are satisfied, return True
        return True