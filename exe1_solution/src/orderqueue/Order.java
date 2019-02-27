package OrderQueue;
import java.util.*;

public class Order {
    
    private int number;
    /** Creates a new instance of Order */
    public Order(int number) {
        this.number = number;
    }
    public String toString() {
        return "Order #" + number;
    }
}
