package chainofresponsibility;

public class LargeOrderHandler extends OrderHandler {

	public LargeOrderHandler(OrderHandler nextOrderHandler) {
		super(nextOrderHandler);
	}

	public void handleOrder(Order order) {
		if (order.getTotalamount() > 100000.0) {
			System.out.println("LargeOrderHandler handles order " + order.getOrderNumber());
		} else {
			nextOrderHandler.handleOrder(order);
		}
	}

}
