package behavior.chainofresponsibility;

public abstract class OrderHandler {

	protected OrderHandler nextOrderHandler;

	public OrderHandler(OrderHandler nextOrderHandler) {
		this.nextOrderHandler = nextOrderHandler;
	}

	public abstract void handleOrder(Order order);
}
