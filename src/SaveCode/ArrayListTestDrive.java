package SaveCode;

import java.util.ArrayList;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        ArrayList<Integer> myLists = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            myLists.add(i * 2);
        }

        int theSize = myLists.size();
        boolean isContains = myLists.contains(4);
        int indexOfSix = myLists.indexOf(6);
        boolean isEmpty = myLists.isEmpty();
        myLists.remove(2);

        System.out.println("The size: " + theSize);
        System.out.println("Contains: " + isContains);
        System.out.println("Index of six: " + indexOfSix);
        System.out.println("Empty: " + isEmpty);

        for (int itemList : myLists) {
            System.out.println(itemList);
        }

    }
}
