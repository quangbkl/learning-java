package UET.Algorithms.Stack;

public class ArrayStack implements Stack {
    public static final int CAPACITY = 1024;
    private int N;
    private Object S[];
    private int t = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int cap) {
        N = cap;
        S = new Object[N];
    }

    @Override
    public int size() {
        return t + 1;
    }

    @Override
    public boolean isEmpty() {
        return t < 0;
    }

    @Override
    public Object top() throws StackEmptyException {
        Object element;
        if (isEmpty()) throw new StackEmptyException("Stack is empty.");
        element = S[t];
        S[t--] = null;
        return element;
    }

    @Override
    public void push(Object element) throws StackFullException {
        if (size() == N) throw new StackFullException("Stack overflow!");
        S[++t] = element;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (isEmpty()) throw new StackEmptyException("Stack is empty.");
        return S[t];
    }
}
