package chainofresponsibility;

public class DomesticOrderHandler extends OrderHandler{
    
	public DomesticOrderHandler(OrderHandler nextHandler) {
		super(nextHandler);
	}

	public void handleOrder(Order order) {
		System.out.println("DomesticOrderHandler handles order " + order.getOrderNumber());
	}

}
