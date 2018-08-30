class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int new_size) {
        size = new_size;
    }

    void bark() {
        if (size <= 10) {
            System.out.println("Wooof! Wooof!");
        } else if (size <= 20) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

public class GoogDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        GoodDog two = new GoodDog();

        one.setSize(3);
        two.setSize(14);

        System.out.println("One Size: " + one.getSize());
        System.out.println("Two Size: " + two.getSize());

        one.bark();
        two.bark();
    }
}
