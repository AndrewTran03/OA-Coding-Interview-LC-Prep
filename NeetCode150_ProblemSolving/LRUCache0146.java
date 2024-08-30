package NeetCode150_ProblemSolving;

import java.util.*;

public class LRUCache0146 {
    class Node {
        public int key;
        public int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public void setValue(int newValue) {
            this.value = newValue;
        }

        @Override
        public String toString() {
            return "{" + key + "=" + value + "}";
        }
    }

    class LRUCache {
        private int maxCapacity;
        private Deque<Node> cacheList;

        public LRUCache(int capacity) {
            this.maxCapacity = capacity;
            this.cacheList = new LinkedList<>();
        }

        private Node exists(int key) {
            Node exists = null;
            for (Node node : this.cacheList) {
                if (node.key == key) {
                    exists = node;
                    this.cacheList.remove(exists);
                    break;
                }
            }
            return exists;
        }

        public int get(int key) {
            Node accessed = exists(key);
            if (accessed != null) {
                this.cacheList.addLast(accessed);
                return accessed.value;
            }
            return -1;
        }

        public void put(int key, int value) {
            Node accessed = exists(key);
            if (accessed == null) {
                if (this.cacheList.size() == maxCapacity) {
                    this.cacheList.removeFirst();
                }
                this.cacheList.addLast(new Node(key, value));
            } else {
                accessed.setValue(value);
                this.cacheList.addLast(accessed);
            }
        }
    }

    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
}
