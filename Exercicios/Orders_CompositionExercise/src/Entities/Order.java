package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enuns.OrderStatus;

public class Order {
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	
	private Client client;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, Client client, OrderStatus status) {
		this.moment = moment;
		this.client = client;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0;
		
		for(OrderItem od : items) {
			sum += od.subTotal();
		}
		
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) +"\n");
		sb.append("Order status: ");
		sb.append(status +"\n");
		sb.append("Client: ");
		sb.append(client +"\n");
		sb.append("\n");
		sb.append("Order items: \n");
		
		for(OrderItem item : items) {
			sb.append(item +"\n");
		}
		
		sb.append("\n");
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}
}
