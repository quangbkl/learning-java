package SaveCode;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            lists.add(i * 2);
        }

        for (int i = 0, length = lists.size(); i < length; i++) {
            int value = lists.get(i);
            lists.set(i, value * 100);
        }

        for (int i = 0, length = lists.size(); i < length; i++) {
            int value = lists.get(i);
            System.out.println(value);
        }
    }
}