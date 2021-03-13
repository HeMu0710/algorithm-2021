package leetcode.march;

import java.util.ArrayList;

public class T705_design_hashset {

    // https://leetcode-cn.com/problems/design-hashset/

    class MyHashSet {

        private boolean[] map = new boolean[1000005];

        /** Initialize your data structure here. */
        public MyHashSet() {
        }

        public void add(int key) {
            map[key] = true;
        }

        public void remove(int key) {
            map[key] = false;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return map[key];
        }
    }

    /**
     * Your MyHashSet object will be instantiated and called as such:
     * MyHashSet obj = new MyHashSet();
     * obj.add(key);
     * obj.remove(key);
     * boolean param_3 = obj.contains(key);
     */
}
