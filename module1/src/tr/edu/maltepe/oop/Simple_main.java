package tr.edu.maltepe.oop;


// Main class to create objects and call the meow method
public class Simple_main {
    public static void main(String[] args) {
        // Creating two Cat objects
        Cat cat1 = new Cat("Whiskers", 3);
        Cat cat2 = new Cat("Mittens", 5);

        // Calling the meow method
        cat1.meow();
        cat2.meow();
    }
}


