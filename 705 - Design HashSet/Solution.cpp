class MyHashSet {
public:

    std::vector<int> hashSet;

    MyHashSet() {
        hashSet.resize(1000001, 0);
    }

    void add(int key) {
        // Set the element at the specified index to 1, indicating it is present
        hashSet[key] = 1;
    }

    void remove(int key) {
        // Set the element at the specified index to 0, indicating it is not present
        hashSet[key] = 0;
    }

    bool contains(int key) {
        // Return the value at the specified index, indicating if the element is present (1) or not (0)
        return hashSet[key];
    }
};