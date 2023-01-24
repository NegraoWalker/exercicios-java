package exercicios.nelio.importantes;
/*
 * paymentFee = taxa de pagamento
 * interest = Juro
 * OnlinePaymentService = Serviço de pagamento online
 */

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
}
