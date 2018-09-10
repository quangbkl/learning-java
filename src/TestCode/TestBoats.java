package TestCode;

public class TestBoats {
    public static void main(String[] args) {
        Boat newBoat = new Boat();
        SailBoat newSailBoat = new SailBoat();
        RowBoat newRowBoat = new RowBoat();
        newSailBoat.setLength(32);
        newBoat.move();
        newRowBoat.move();
        newSailBoat.move();
    }
}

class Boat {
    private int length;

    public void setLength(int len) {
        this.length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.print("dift ");
    }
}

class RowBoat extends Boat {
    public void rowTheBoat() {
        System.out.print("stroke natasha");
    }
}

class SailBoat extends Boat {
    public void move() {
        System.out.print("hoist sail ");
    }
}