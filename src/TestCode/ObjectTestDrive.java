package TestCode;

class House {
    public void getAmount() {
        System.out.println("45$.");
    }
}

class Dorm extends House {
    public void getPeople() {
        System.out.println("11 people.");
    }
}

class Villa {
    public void getFloors() {
        System.out.println("Six.");
    }
}

public class ObjectTestDrive {
    public static void main(String[] args) {
        House newHouse = new Dorm();
        Object o = newHouse;
        if (o instanceof Villa) {
            System.out.println("Yes");
        }
    }
}
