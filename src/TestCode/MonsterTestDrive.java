package TestCode;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for (int i = 0; i < ma.length; i++) {
            System.out.print("Monster " + i + " is: ");
            ma[i].frighten(i);
        }
    }
}

class Monster {
    boolean frighten(int d) {
        System.out.println("Arrrgh");
        return true;
    }
}

class Vampire extends Monster {
    boolean frighten(int x) {
        System.out.println("A bite?");
        return false;
    }
}

class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("Breath fire.");
        return true;
    }
}