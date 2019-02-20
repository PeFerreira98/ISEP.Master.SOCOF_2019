import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class OrderHandler implements Runnable{
	public ConcurrentLinkedQueue<Order> orders;

	public OrderHandler(ConcurrentLinkedQueue<Order> orders) {
		this.orders = orders;
	}
	
	@Override
	public void run() {
		while(true) {
			if (!this.orders.isEmpty()) {
				Order o = this.orders.poll();
				System.out.println("out_" + o.number);
			}
		}
	}
}
