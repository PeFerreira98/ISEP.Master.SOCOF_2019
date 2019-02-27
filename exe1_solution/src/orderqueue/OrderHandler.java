package OrderQueue;
import java.util.*;

public class OrderHandler extends Thread{
    
    private OrderQueue orderQueue;
    /** Creates a new instance of OrderHandler */
    public OrderHandler(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }
    public void run() {
        Order order;
        while(true) {
            
            order = orderQueue.pullOrder();
            if(order!=null)
                System.out.println("\t\t\t\t"+order.toString()+" processado por "+this.getName());
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e){}
        }
    }
}
