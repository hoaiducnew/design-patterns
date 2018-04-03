package behavior.chainofresponsibility;

public class OrderReceiver {
	OrderHandler domesticOrderHandler = new DomesticOrderHandler(null);
	OrderHandler internationalOrderHandler = new InternationalOrderHandler(domesticOrderHandler);
	OrderHandler largeOrderHandler = new LargeOrderHandler(internationalOrderHandler);
	OrderHandler mostFavoredCustomerOrderHandler = new MostFavoredCustomerOrderHandler(largeOrderHandler);
	
	 public void receiveOrder(Order order) {
		 mostFavoredCustomerOrderHandler.handleOrder(order);
	 }
}
