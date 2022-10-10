package exercicios.leonardo;

public class Desafio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Desafio 9: Imprimir na tela uma escada com o símbolo #.
 * Não podemos usar na variável de controle do laço for números
 * Exemplo:
 * String valor = "#";
 * for(int i=1;i<=5;i++){
 * System.out.println(valor);
 * valor+="#";
 * }
 * 
 */
		
		for (String i = "#"; !i.equals("######"); i+="#") {
			System.out.println(i);
		}
	
	}

}
