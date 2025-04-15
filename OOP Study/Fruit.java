public class Fruit extends Item {
    private String type;

    // Fruit is the subclass of Item
    // Item is the super class
    public Fruit( String name, int quantity, String type){
        super(name, quantity);
        this.type = type;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString(){  // this is runtime polymorphism 
        return "Item: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + type;
    }
}