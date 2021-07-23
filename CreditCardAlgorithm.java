package StrategyDesignPattern2;

public class CreditCardAlgorithm implements Payment {
	private String name;
	private String cardNumber;

	CreditCardAlgorithm(String name, String cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}
	@Override
	public void pay(int price)
	{
		System.out.println(price + "Rs. Paid using Creadit card");
	}
}
