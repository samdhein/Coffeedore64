import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
        // Menu items
        coffeeKiosk.addMenuItem("muffin", 2.50);
        coffeeKiosk.addMenuItem("banana", 1.00);
        coffeeKiosk.addMenuItem("latte", 5.00);
        coffeeKiosk.addMenuItem("drip coffee", 4.00);

        coffeeKiosk.newOrder();
        
    }
}
