public class Main {
    public static void main(String[] args){

        Inventory inventory = new Inventory();

        Item item1 = new Item("Mugs", 10);
        Fruit item2 = new Fruit("Strawberry", 23, "Berry");
        Weapon item3 = new Weapon("AK-47",2,"Rifle",100);
        
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        inventory.displayInventory();


    }
}