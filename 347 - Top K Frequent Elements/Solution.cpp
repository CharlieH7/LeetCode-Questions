class Solution {
public:
    struct Compare {
        bool operator() (const std::pair<int, int>& lhs, const std::pair<int, int>& rhs) const {
            return lhs.second > rhs.second;
        }
    };

    vector<int> topKFrequent(vector<int>& nums, int k) {
        // Create a frequency map to count occurrences of each element
        std::unordered_map<int, int> freqMap;
        for (int num : nums) {
            freqMap[num]++;
        }
        // Create a priority queue (min-heap) to store top k frequent elements
        std::priority_queue<std::pair<int, int>, std::vector<std::pair<int, int>>, Compare> pq;
        for (auto it = freqMap.begin(); it != freqMap.end(); it++) {
            pq.push(*it);
            // Maintain the size of the priority queue as k by popping the top element (smllest element in the min-heap)
            if (pq.size() > k) {
                pq.pop();
            }
        }
        // Create a vector to store the top k frequent elements
        std::vector<int> topKElements;
        while (!pq.empty()) {
            topKElements.push_back(pq.top().first);
            pq.pop();
        }
        // Reverse the vector to get the top k frequent elements in descending order
        std::reverse(topKElements.begin(), topKElements.end());
        return topKElements;
    }
};