import java.util.ArrayList;

public class CoffeeKiosk{
    //member variables
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    //constructor
    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    //getters
    public ArrayList<Item> getMenu(){
        return this.menu;
    }
    public ArrayList<Order> getOrders(){
        return this.orders;
    }
    //methods
    //addMenuItem
    public void addMenuItem(String name, double price){
        Item tempItem = new Item(name, price);
        menu.add(tempItem);
        int index = menu.indexOf(tempItem);
        tempItem.setIndex(index);
    }
    //displayMenu
    public void displayMenu(){
        for(Item i: this.menu){
            System.out.println(i.getIndex() + " -- "+ i.getName() + " -- $" + i.getPrice());
        }
    }
    //newOrder
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order newOrder = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
        
            // Get the item object from the menu, and add the item to the order
            int i = Integer.parseInt(itemNumber);
            if(i < this.menu.size()){
                Item orderItem = menu.get(i);
                newOrder.addItem(orderItem);
            } else {
                System.out.println("Sorry we do not have it");
            }
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter the index of the coffee you would like to order, or press q to exit");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        // as the example below. You may use the order's display method.
        newOrder.display();
        this.orders.add(newOrder);
        
    }







}