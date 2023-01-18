package exercicios.nelio.importantes;

public class WithdrawError extends RuntimeException  {
	private static final long serialVersionUID = 1L;

	public WithdrawError(String msgError) {
		super(msgError);
	}
}
