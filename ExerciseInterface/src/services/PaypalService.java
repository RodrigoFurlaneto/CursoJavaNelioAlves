package services;

public class PaypalService implements OnlinePaymentService{

	private static final double feePercentage = 0.02;
	private static final double monthlyInterest = 0.01;
	
	@Override
	public Double paymentFee(double amount) {
		return amount * feePercentage;
	}

	@Override
	public Double interest(double amount, int months) {
		return amount * monthlyInterest * months;
	}

}
