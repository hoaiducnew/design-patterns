package chainofresponsibility;

public class InternationalOrderHandler extends OrderHandler{
    
	public InternationalOrderHandler(OrderHandler nextHandler) {
		super(nextHandler);
	}

	public void handleOrder(Order order) {
		if (order.isInternational()){
			System.out.println("InternationalOrderHandler handles order " + order.getOrderNumber());
		} else {
			nextOrderHandler.handleOrder(order);
		}
	}

}
