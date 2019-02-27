package OrderQueue;
import java.util.*;

public class OrderQueueApp {
    
    public static void main(String[] args){
        final int TAKER_COUNT  = 3;
        final int ORDER_COUNT = 3;
        final int HANDLER_COUNT = 2;
        
        OrderQueue queue = new OrderQueue();
        
        System.out.println("Inicializando...");
        System.out.println("Começando "+TAKER_COUNT+" threads de produção, " +
                "cada uma produzindo " +ORDER_COUNT+" pedidos.");
        for(int i = 0; i < TAKER_COUNT;i++)
        {
            OrderTaker t = new OrderTaker(ORDER_COUNT,queue);
            t.start();
        }
        System.out.println("Começando "+HANDLER_COUNT+" threads de tratamento .");
        for(int i = 0; i < HANDLER_COUNT;i++)
        {
            OrderHandler h = new OrderHandler(queue);
            h.start();
        }
        
    }
}    
