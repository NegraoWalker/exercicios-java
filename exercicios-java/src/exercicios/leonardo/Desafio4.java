package exercicios.leonardo;

public class Desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Desafio 4:
 * Trabalho na terça (true/false)
 * Trabalho na quinta (true/false)
 * Se apenas um dos trabalhos for true => Comprar TV 32 pol e tomar sorvete
 * Se os dois trabalhos for true => Comprar TV 50 pol e tomar sorvete
 * Se nenhum dos trabalhos for true => Não compra nada e não toma sorvete
 * 
 *	
 */		
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		if (trabalho1 == true && trabalho2 == false) {
			System.out.println("Comprou TV de 32 polegas e tomou sorvete");
		} else if(trabalho1 == false && trabalho2 == true) {
			System.out.println("Comprou TV de 32 polegas e tomou sorvete");
		} else if(trabalho1 == true && trabalho2 == true) {
			System.out.println("Comprou TV de 50 polegas e tomou sorvete");
		} else {
			System.out.println("Não comprou TV e não tomou sorvete");
		}
		
		
		
	}

}
