class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Counter for the number of flowers placed
        int count = 0;

        // Iterate through the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current spot is empty, and if the spots before and after it (if
            // they exist) are also empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Place a flower in the current spot
                flowerbed[i] = 1;
                count++;
            }

            // Check if we've placed enough flowers
            if (count >= n) {
                return true;
            }
        }

        // Return false if we haven't placed enough flowers
        return false;
    }
}
