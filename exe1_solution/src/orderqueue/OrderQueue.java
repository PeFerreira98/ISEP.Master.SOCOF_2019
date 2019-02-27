package OrderQueue;
import java.util.concurrent.*;
import java.util.*;

public class OrderQueue {
    
    private ConcurrentLinkedQueue<Order> orderQueue = new ConcurrentLinkedQueue<Order>();
    
    public  void pushOrder(Order order) {
        orderQueue.add(order);
        
        
    }
    public  Order pullOrder() {
        Order t = null;
        try{
            t = orderQueue.remove();
        } catch(NoSuchElementException e){}
        
        return t;
        
        
    }
    
}
