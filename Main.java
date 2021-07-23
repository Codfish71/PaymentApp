package StrategyDesignPattern2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();
		
		Product pant = new Product("234", 1455);
		Product shirt = new Product("235", 1099);
		
		cart.add(pant);
		cart.add(shirt);
		
		cart.calculateTotal();
		
		cart.pay(new PaypalAlgorithm("abcd@gmail.com", "1234@abcd"));
		cart.pay(new CreditCardAlgorithm("Prathamesh Pendal","1234 4567 8901"));
	}

}
