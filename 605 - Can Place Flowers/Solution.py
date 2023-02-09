class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        # Add 0s to the front and end of flowerbed list to handle edge cases
        f = [0] + flowerbed + [0]
        
        # Iterate over elements in f list, starting from the second element and ending at the second-to-last element
        for i in range(1, len(f) - 1):
            # If current element and the two elements before and after it are all 0s, plant a flower and decrement n
            if f[i - 1] == 0 and f[i] == 0 and f[i+1] == 0:
                f[i] = 1
                n-=1
        # Return True if n is less than or equal to 0, False otherwise
        return n <= 0
