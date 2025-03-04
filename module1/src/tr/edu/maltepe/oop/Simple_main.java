package tr.edu.maltepe.oop;

class Cat {
    private String name;
    private int age;

    // Constructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Meow method
    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}

// Main class to create objects and call the meow method
public class Simple_Main {
    public static void main(String[] args) {
        // Creating two Cat objects
        Cat cat1 = new Cat("Whiskers", 3);
        Cat cat2 = new Cat("Mittens", 5);

        // Calling the meow method
        cat1.meow();
        cat2.meow();
    }
}


