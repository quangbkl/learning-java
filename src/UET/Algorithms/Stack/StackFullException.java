package UET.Algorithms.Stack;

public class StackFullException extends Exception {
    private String message;

    public StackFullException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
