package UET.Algorithms.Stack;

public class StackTestDrive {
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack();
        try {
            as.push("dslkfj");
            as.push(983475);
            as.push("skaljf");
        } catch (StackFullException e) {
            e.printStackTrace();
        }

        for (int i = 0, length = as.size(); i < length; i++) {
            try {
                System.out.println(as.top());
            } catch (StackEmptyException e) {
                e.printStackTrace();
            }
        }
    }
}
