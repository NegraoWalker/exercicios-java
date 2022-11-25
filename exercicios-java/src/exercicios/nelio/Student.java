package exercicios.nelio;

public class Student {
//Atributos da classe:
private String name;
//Métodos da classe:

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double finalMedia(double nota1, double nota2, double nota3) {
	double finalNota = nota1 + nota2 + nota3;
	
	System.out.printf("Final Grade: %.2f", finalNota);
	System.out.println();
	
	if (finalNota >= 60) {
		System.out.println("PASS!!");
	} else if(finalNota<=60) {
		System.out.println("FAILED");
		double notaRecuperacao = 60 - finalNota;
		System.out.printf("Missing: %.2f", notaRecuperacao);
	}
	return 0;
}
}
