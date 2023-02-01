package week08.lab.lab1;

public class Dog extends Animal  {
    public Dog() {

    }

    public Dog(String name, int age, String colour) {
        super(name, age, colour);
    }

    public void makeNoise() {
        System.out.println(super.getName() + " is barking.");
    }
}

