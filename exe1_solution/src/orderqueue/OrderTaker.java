package OrderQueue;
import java.util.*;

public class OrderTaker extends Thread{
    
    public static int orderNumber = 1;
    
    private int count=0;
    private int maxOrders;
    private OrderQueue orderQueue;
    private String name;
    
    public OrderTaker(int orderCount,OrderQueue orderQueue) {
        this.maxOrders = orderCount;
        this.orderQueue = orderQueue;
    }
    
    public void run() {
        int orderNumber;
        Order order;
        while(count < maxOrders) {
            order = new Order(getOrderNumber());
            orderQueue.pushOrder(order);
            System.out.println(order.toString()+" criada por "+this.getName());
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){}
        }
    }
    private synchronized int getOrderNumber() {
        return orderNumber++;
    }
    
}
