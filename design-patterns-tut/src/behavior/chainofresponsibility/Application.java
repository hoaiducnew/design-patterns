package behavior.chainofresponsibility;

public class Application {

	public static void main(String[] args) {
		OrderReceiver or = new OrderReceiver();

		Order order1 = new Order("001", 70000, false, new Customer("Duke"));
		or.receiveOrder(order1);

		Order order2 = new Order("002", 600, true, new Customer("May"));
		or.receiveOrder(order2);

		Order order3 = new Order("003", 88000, false, new Customer("Anh"));
		or.receiveOrder(order3);
	}

}
