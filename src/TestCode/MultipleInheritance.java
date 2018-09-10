package TestCode;

class Animals {
    public void talk() {
        System.out.println("Animal! Animal!");
    }
}

interface Pet {
    public abstract void go();
}

class Dog extends Animals implements Pet {
    public void go() {
        System.out.println("Implements.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.go();
    }
}