package CoursesUET;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insertionSort {
    public static void sort(List<Integer> lists) {
        for (int i = 1, length = lists.size(); i < length; i++) {
            int pos = i - 1;

            while (pos >= 0 && lists.get(pos) > lists.get(pos + 1)) {
                int a = lists.get(pos);
                int b = lists.get(pos + 1);
                lists.set(pos, b);
                lists.set(pos + 1, a);
                pos--;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\QUANG BKL\\Desktop\\Code\\Java\\First\\src\\CoursesUET\\input.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> lists = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int numInFile = scanner.nextInt();
            lists.add(numInFile);
        }

        sort(lists);

        for (int list : lists) {
            System.out.print(list + " ");
        }
    }
}
