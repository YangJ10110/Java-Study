import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<Item> items; // this stores objects 
    /*
       2. `ArrayList<Item>`
        - `ArrayList` is a class in Java's `java.util` package that implements a resizable array. Unlike regular arrays, it can grow or shrink dynamically as elements are added or removed.
        - `<Item>` is a generic type parameter. It specifies that this `ArrayList` will only store objects of type `Item`. This ensures type safety, meaning you can't accidentally add objects of a different type (e.g., `String` or `Integer`) to this list.
        - `Item` is likely a custom class defined elsewhere in your project.
    */
    // this refers to item.java so it contains: name and quantity

    // constructor

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void displayInventory(){
        for (Item item : items) {
            System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());
        }
    }

}