package CoursesUET;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void sort(List<Integer> lists) {
        for (int i = 0, length = lists.size(); i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                int a = lists.get(j);
                int b = lists.get(j + 1);
                if (a > b) {
                    lists.set(j, b);
                    lists.set(j + 1, a);
                }
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

        System.out.println("Bubble sort: ");
        for (int list : lists) {
            System.out.print(list + " ");
        }
    }
}
