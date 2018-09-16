public class Queue {
    private int front = -1;
    private int rear = -1;
    private int count = 0;
    private int[] queue;

    public Queue(int size) {
        this.queue = new int[size];
    }

    public boolean enqueue(int el) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException();
        }
        if (isEmpty()) {
            front++;
            rear++;
            queue[rear] = el;
            count++;
            return true;
        }
        if (rear == queue.length - 1) {
            rear = 0;
        } else {
            rear++;
        }
        queue[rear] = el;
        count++;
        return true;

    }

    public int dequeue() throws QueueEmptyException {
        if (!isEmpty()) {
            int el = queue[front];
            if (front == 0) {

            }
            if (front == queue.length - 1) {
                front = 0;
            } else {
                front++;
            }
            count--;
            return el;
        }
        throw new QueueEmptyException();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public int peek() {
        return queue[front];
    }

    @Override
    public String toString() {
        String s = "";
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                s += queue[i] + " ";
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                s += queue[i] + " ";
            }
            for (int i = 0; i <= rear; i++) {
                s += queue[i] + " ";
            }
        }
        return s;
    }
}
