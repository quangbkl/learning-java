class Dog {
    int size;
    String name;

    void bark() {
        if (size <= 10) {
            System.out.println("Goo goo goo.");
        } else if (size <= 20) {
            System.out.println("Ging ging ging.");
        } else {
            System.out.println("Goest goest goest.");
        }
    }
}
public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        Dog two = new Dog();
        Dog three = new Dog();

        one.size = 2;
        two.size = 14;
        three.size = 29;

        one.bark();
        two.bark();
        three.bark();
    }
}
