package StrategyDesignPattern2;

public class PaypalAlgorithm implements Payment{
	private String email;
	private String password;

	PaypalAlgorithm(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(int price) {
		System.out.println(price + "Rs. Paid using Paypal!");
	}
}
