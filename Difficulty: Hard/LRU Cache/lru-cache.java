import java.util.HashMap;
import java.util.Map;

class LRUCache {
    static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static int capacity;
    private static Map<Integer, Node> map;
    private static Node head;
    private static Node tail;

    LRUCache(int cap) {
        capacity = cap;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    private static void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private static void insert(Node node) {
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public static int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }

    public static void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);
        } else {
            if (map.size() == capacity) {
                Node lru = tail.prev;
                map.remove(lru.key);
                remove(lru);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insert(newNode);
        }
    }
}