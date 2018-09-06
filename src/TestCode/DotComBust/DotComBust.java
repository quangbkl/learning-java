package TestCode;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index > 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");
            } else {
                result = "hit";
            }
        }

        return result;
    }
}

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

    private void startPlaying() {
        while(!dotComArrayList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComArrayList) {
            result =  dotComToTest.checkUserGuess(userGuess);
            if (result.equals("hit")) break;
            if (result.equals("kill")) {
                dotComArrayList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All dot coms is dead! Your stock is now worthless.");

        if (numOfGuesses < 18) {
            System.out.println("It only took you " +  numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args) {

    }
}
