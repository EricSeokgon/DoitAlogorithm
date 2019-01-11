package chapter4;

public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    public IntQueue(int capacit) {
        num = front = rear = 0;
        max = capacit;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }

    }
}
