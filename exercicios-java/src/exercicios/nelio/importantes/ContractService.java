package exercicios.nelio.importantes;

import java.time.LocalDate;

public class ContractService {

	private OnlinePaymentService onlinePaymentService; //O serviço de contrato depende do pagamento online

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

//Método que realiza os cálculos das parcelas:
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months; //Pegando o valor do contrato e dividindo pela quantidade de meses
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i); //Incrementando a data de inicio do contrato e adicionando 1 para pagamentos das parcelas
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest); 
			double quota = basicQuota + interest + fee;
			
			contract.getListInstallment().add(new Installment(dueDate, quota));
		}
	}
	
	
	
	
	
}
