class Solution: {
    public:
        std::vector<int> sortArray(std::vector<int>& nums) {
            mergeSort(nums, 0, nums.size() - 1);
            return nums;
        }
    private:
        void mergeSort(std::vector<int>& nums, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;

                // Sort the left and right halves recursively
                mergeSort(nums, left, mid);
                mergeSort(nums, mid + 1, right);

                // Merge the sorted halves
                merge(nums, left, mid, right);
            }
        }

        void merge(std::vector<int>& nums, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Create temporary arrays for the left and right halves
            std::vector<int> L(n1), R(n2);

            // Copy the data to the temporary arrays
            for (int i = 0; i < n1; i++) {
                L[i] = nums[left + i];
            }
            for (int j = 0; j < n2; j++) {
                R[j] = nums[mid + 1 + j];
            }

            // Merge the temporary arrays back into nums
            // Index of the first subarray
            int i = 0;
            // Index of the second subarray
            int j = 0;
            // Index of the merged subarray
            int k = left;

            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    nums[k] = L[i];
                    i++;
                } 
                else {
                    nums[k] = R[j];
                    j++;
                }
                k++;
            }

            // Copy the remaining elements of L[], if there are any
            while (i < n1) {
                nums[k] = L[i];
                i++;
                k++;
            }

            // Copy the remaining elements of R[], if there are any
            while (j < n2) {
                nums[k] = R[j];
                j++;
                k++;
            }
        }
}