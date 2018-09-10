package TestCode.Animal;

public class AnimalTestDrive {
    public static void main(String[] args) {
        System.out.println("Test");
    }
}

class Animal {
    public void takl() {
        System.out.println("Animal! Animal!");
    }
}

class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Dog added at " + nextIndex);
            nextIndex++;
        }
    }
}

class Dog {
    void talk() {
        System.out.println("Go! Go!");
    }
}

class MyDogList {
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);
            nextIndex++;
        }
    }
}