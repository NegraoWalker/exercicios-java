package exercicios.nelio.importantes;

public enum OrderStatus {
	PENDING_PAYMENT(0), PROCESSING(1), SHIPPED(2), DELIVERED(3);
	
//Atributos:
int priority;
//Métodos:
private OrderStatus(int priority) {
	this.priority = priority;
}
public int getPriority() {
	return priority;
}

	
}

/*Tradução:
* PENDING_PAYMENT = Pagamento pendente
* PROCESSING = Processando
*SHIPPED = Enviado
*DELIVERED = Entregue
*/






/*Enumerações Avançado:
 * No exercício é definido valores inteiros que definem prioridade para cada constante. Para que isso seja possível há a
 * necessidade de definir um atributo do mesmo tipo e também um construtor
 * 
 * */
 