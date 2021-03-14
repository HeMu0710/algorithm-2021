package leetcode.march;

import java.util.Arrays;

public class T706_design_hashmap {

    // https://leetcode-cn.com/problems/design-hashmap/

    class MyHashMap {

        private int[] data;

        /** Initialize your data structure here. */
        public MyHashMap() {
            data = new int[1000005];
            Arrays.fill(data, -1);
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            data[key] = value;
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            return data[key];
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            data[key] = -1;
        }
    }
}
