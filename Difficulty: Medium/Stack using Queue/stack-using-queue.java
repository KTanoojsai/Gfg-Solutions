class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);
        int sz = q.size();
        for (int i = 0; i < sz - 1; i++) {
            q.add(q.remove());
        }
    }

    void pop() {
        if (!q.isEmpty()) {
            q.remove();
        }
    }

    int top() {
        if (q.isEmpty()) {
            return -1;
        }
        return q.peek();
    }

    int size() {
        return q.size();
    }
}