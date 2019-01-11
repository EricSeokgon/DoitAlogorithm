package chapter4;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){}
    }

    public IntStack(int capcity) {
        ptr=0;
        max = capcity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError error) {
            max = 0;
        }
    }
}
