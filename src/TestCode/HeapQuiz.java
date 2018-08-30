public class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        HeapQuiz [] hq = new HeapQuiz[5];

        while (x < 3) {
            hq[x] = new HeapQuiz();
            hq[x].id = x;
            x++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Value is: " + hq[i].id);
        }
    }
}
