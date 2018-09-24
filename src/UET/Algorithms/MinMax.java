package UET.Algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pair {
    Integer min, max;
}

public class MinMax {
    public Pair getMinMax(List<Integer> lists) {
        Pair result = new Pair();
        int length = lists.size();
        int i;

        if (length % 2 == 0) {
            if (lists.get(0) > lists.get(1)) {
                result.max = lists.get(0);
                result.min = lists.get(1);
            } else {
                result.max = lists.get(1);
                result.min = lists.get(0);
            }

            i = 2;
        } else {
            result.max = lists.get(0);
            result.min = lists.get(0);
            i = 1;
        }

        while (i < length - 1) {
            if (lists.get(i) > lists.get(i + 1)) {
                if (lists.get(i) > result.max)
                    result.max = lists.get(i);
                if (lists.get(i + 1) < result.min)
                    result.min = lists.get(i + 1);
            } else {
                if (lists.get(i + 1) > result.max)
                    result.max = lists.get(i + 1);
                if (lists.get(i) < result.min)
                    result.min = lists.get(i);
            }

            i += 2;
        }

        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\QUANG BKL\\Desktop\\Code\\Java\\First\\src\\CoursesUET\\input.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> lists = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int numInFile = scanner.nextInt();
            lists.add(numInFile);
        }

        MinMax mm = new MinMax();
        Pair minMax = mm.getMinMax(lists);
        System.out.println(minMax.max + " " + minMax.min);
    }
}
