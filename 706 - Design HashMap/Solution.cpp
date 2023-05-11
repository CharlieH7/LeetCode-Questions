class MyHashMap
{
public:
    std::map<int, int> myMap;
    // MyHashMap() initializes the object with an empty map.
    MyHashMap() : myMap()
    {
    }
    // void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
    void put(int key, int value)
    {
        auto it = myMap.find(key);
        if (it != myMap.end())
        {
            it->second = value;
        }
        else
        {
            myMap[key] = value;
        }
    }
    // int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
    int get(int key)
    {
        auto it = myMap.find(key);
        if (it != myMap.end())
        {
            int value = it->second;
            return value;
        }
        else
        {
            return -1;
        }
    }
    // void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
    void remove(int key)
    {
        auto it = myMap.find(key);
        if (it != myMap.end())
        {
            myMap.erase(it);
        }
    }
};