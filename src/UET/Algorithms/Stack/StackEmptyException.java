package UET.Algorithms.Stack;

public class StackEmptyException extends Exception {
    private String message;

    public StackEmptyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
