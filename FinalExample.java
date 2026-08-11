final class College {
    void displayCollege() {
        System.out.println("ABC Engineering College");
    }
}
class Animal {
    // Final Method
    final void sound() {
        System.out.println("Animals make sounds.");
    }
}
class Dog extends Animal {
    }
public class FinalExample {
    public static void main(String[] args) {
        // Final Variable
        final int MAX = 100;
        System.out.println("Final Variable: " + MAX);
        // MAX = 200; // Error: Cannot assign a value to final variable
        Dog d = new Dog();
        d.sound();
        College c = new College();
        c.displayCollege();
    }
}