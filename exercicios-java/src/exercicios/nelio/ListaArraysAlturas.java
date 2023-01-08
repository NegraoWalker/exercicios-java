package exercicios.nelio;

public class ListaArraysAlturas {

//Atributos da classe:
	private String nome;
	private Integer idade;
	private Double altura;
//Métodos da classe:
	public ListaArraysAlturas() {
		
	}
	
	public ListaArraysAlturas(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public Double getAltura() {
		return altura;
	}
}
