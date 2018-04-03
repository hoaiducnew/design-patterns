package behavior.chainofresponsibility;

import java.util.ArrayList;
import java.util.Collection;

public class MostFavoredCustomerOrderHandler extends OrderHandler{
    private Collection<Customer> customerlist = new ArrayList<Customer>();
    
	public MostFavoredCustomerOrderHandler(OrderHandler nextOrderHandler) {
		super(nextOrderHandler);
		customerlist.add(new Customer("Ha"));
		customerlist.add(new Customer("Vu"));
	}

	public void handleOrder(Order order) {
		boolean found = false;
		for (Customer cust : customerlist){
		   if (order.getCustomer().getName().equals(cust.getName())){
			   found=true;
			   System.out.println("MostFavoredCustomerOrderHandler handles order " + order.getOrderNumber());
		   }
		}
		if (!found) {
			nextOrderHandler.handleOrder(order);
		}
	}
}
