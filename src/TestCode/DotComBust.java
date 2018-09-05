package TestCode;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComArrayList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();
        one.setName("Pes.com");
        two.setName("Quang.com");
        three.setName("Linh.com");
        dotComArrayList.add(one);
        dotComArrayList.add(two);
        dotComArrayList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pes.com, Quang.com, Link.com");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for (DotCom dotComToSet : dotComArrayList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public static void main(String[] args) {

    }
}
