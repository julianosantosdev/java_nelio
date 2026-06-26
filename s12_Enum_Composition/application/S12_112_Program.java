package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class S12_112_Program {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		OrderStatus orderStatus1 = OrderStatus.DELIVERED;
		OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(orderStatus1);
		System.out.println(orderStatus2);

	}

}
