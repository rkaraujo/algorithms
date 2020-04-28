package software.renato.algo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/*
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

The cache is initialized with a positive capacity.

Follow up:
Could you do both operations in O(1) time complexity?

Example:

LRUCache cache = new LRUCache( 2 // capacity // );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // returns 1
        cache.put(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);       // returns 4
 */
public class LRUCache {

    private int capacity;
    private Deque<Integer> LRUkeys = new ArrayDeque<>();
    private Map<Integer, Integer> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value = cache.getOrDefault(key, -1);
        if (LRUkeys.size() > 0 && value != -1) {
            refreshKey(key);
        }
        return value;
    }

    public void put(int key, int value) {
        if (cache.get(key) == null) {
            LRUkeys.addFirst(key);
        } else {
            refreshKey(key);
        }

        cache.put(key, value);

        if (cache.size() > capacity) {
            Integer expiredKey = LRUkeys.removeLast();
            cache.remove(expiredKey);
        }
    }

    private void refreshKey(int key) {
        LRUkeys.remove(key);
        LRUkeys.addFirst(key);
    }
}
