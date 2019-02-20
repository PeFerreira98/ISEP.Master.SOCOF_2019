import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class OrderTaker implements Runnable{
	private ConcurrentLinkedQueue<Order> orders;
	
	public OrderTaker(ConcurrentLinkedQueue<Order> orders) {
		this.orders = orders;
	}
	
	@Override
	public void run() {
		int i=0;
		for(i=0; i<=100; i++) {
			Order o = new Order();
			//System.out.println(this.orders.add(o) + "_" + o.number);
			this.orders.add(o);
		}
	}
}
