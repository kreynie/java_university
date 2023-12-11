public class ArrayQueue {
    private int[] queue;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue() {
        queue = new int[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public void enqueue(int element) {
        if (size == queue.length) {
            throw new IllegalStateException("Очередь полная");
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пустая");
        }
        return queue[head];
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пустая");
        }
        int element = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}

