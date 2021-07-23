package StrategyDesignPattern2;

import java.util.*;

public class ShoppingCart {
	List<Product> productList;

	ShoppingCart() {
		this.productList = new ArrayList<>();
	}

	public void add(Product product) {
		productList.add(product);
	}

	public void remove(Product product) {
		productList.remove(product);
	}

	public int calculateTotal() {
		int sum = 0;
		for (Product product : productList) {
			sum += product.getPrice();
		}
		return sum;
	}
	public void pay(Payment paymentStrategy) {
		int amount = calculateTotal();
		paymentStrategy.pay(amount);
	}
	
}
