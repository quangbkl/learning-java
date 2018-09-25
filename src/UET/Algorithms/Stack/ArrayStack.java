package UET.Algorithms.Stack;

public class ArrayStack implements Stack {
    public static final int CAPACITY = 1024;
    private int lengthStack;
    private Object Stacks[];
    private int indexItem = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int cap) {
        lengthStack = cap;
        Stacks = new Object[lengthStack];
    }

    @Override
    public int size() {
        return indexItem + 1;
    }

    @Override
    public boolean isEmpty() {
        return indexItem < 0;
    }

    @Override
    public Object top() throws StackEmptyException {
        Object element;
        if (isEmpty()) throw new StackEmptyException("Stack is empty.");
        element = Stacks[indexItem];
        Stacks[indexItem--] = null;
        return element;
    }

    @Override
    public void push(Object element) throws StackFullException {
        if (size() == lengthStack) {
            lengthStack += CAPACITY;
            Object newStacks[] = new Object[lengthStack];

            for (int i = 0, length = size(); i < length; i++) {
                System.out.println("Full stack.");
                newStacks[i] = Stacks[i];
            }

            Stacks = newStacks;
        }
        Stacks[++indexItem] = element;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (isEmpty()) throw new StackEmptyException("Stack is empty.");
        return Stacks[indexItem];
    }
}
