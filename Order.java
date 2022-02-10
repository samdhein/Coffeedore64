import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "guest";
        this.ready = false;
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.ready = false;
    }
        // ORDER METHODS
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if(this.ready){
            return "Order is ready";
        } else {
            return "Please wait, order not yet ready.";
        }
    }
    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }    

    public void display(){
        System.out.printf("Customer name: %s", this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }


    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Item> getItems(){
        return items;
    }
    public void setItems(ArrayList<Item> Items){
        this.items = items;
    }
    public boolean getReady(){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }

    
}

