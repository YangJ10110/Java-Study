// This is an object class

public class Item {
    // Attributes
    private String name;
    private int quantity;

    /*
        Encapsulation is the bundling of data with the methods that operate on that data.
        It restricts direct access to some of an object's components and can prevent the accidental modification of data.
        In Java, encapsulation is achieved using access modifiers.
        The access modifiers are:
        1. public: The class, method, or variable is accessible from any other class.
        2. private: The class, method, or variable is accessible only within its own class.
        3. protected: The class, method, or variable is accessible within its own package and by subclasses.
        4. default: The class, method, or variable is accessible only within its own package.
        5. final: The class, method, or variable cannot be changed.
        6. static: The class, method, or variable belongs to the class, rather than to instances of the class.
        7. transient: The class, method, or variable is not serialized.
        8. volatile: The class, method, or variable may be changed unexpectedly.
        9. synchronized: The class, method, or variable is thread-safe.
        10. native: The class, method, or variable is implemented in a language other than Java.
    */

    // These methods are called getters and setters
    // Getters and Setters
    // Getters are used to get the value of an attribute
    // Setters are used to set the value of an attribute


    public Item(String name, int quantity) { //This is a constructor
        this.name = name;
        this. quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){  // this is runtime polymorphism 
        return "Item: " + name + ", Quantity: " + quantity;
    }

}