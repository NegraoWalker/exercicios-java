package exercicios.nelio.importantes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Arquivo {

	public static void main(String[] args) {
/*
Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo
 */		
		
		
//	"D:\\Java\\Udemy\\Curso_Java\\Nelio\\Secao17\\arquivo.csv"; //Caminho definido para o arquivo .csv de entrada
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<ProductArquivo> list = new ArrayList<ProductArquivo>();
		
		System.out.println("Enter file path: "); //User informa um caminho de um arquivo.csv
		String path = input.nextLine(); //Recebendo o caminho do arquivo.csv
		
		File sourceFile = new File(path); //Instanciando um objeto da classe File a partir do caminho do arquivo.csv
		String sourceFolder = sourceFile.getParent(); //Passando o caminho correspondente da pasta pai do arquivo.csv - D:\Java\Udemy\Curso_Java\Nelio\Secao17
		
		 new File(sourceFolder + "\\out").mkdir(); //Criando uma subpasta dentro da pasta pai do arquivo.csv chamada out
		
		String pathNewFile = sourceFolder + "\\out\\summary.csv"; //Criando o caminho para o novo arquivo chamado summary.csv
		
		//Lendo o arquivo de entrada arquivo.csv:
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine(); //Lendo cada linha que contêm cada produto
			while (line != null) {
				String [] fields = line.split(","); //Separando as informações do produto a partir da vírgula que finaliza a informação e armazeno no vetor do tipo String
				String name = fields[0]; //Recebendo o nome do produto
				double price = Double.parseDouble(fields[1]); //Recebendo o preço do produto. A função parse converte do tipo String para o double
				int quantity = Integer.parseInt(fields[2]); //Recebendo a quantidade do produto. A função parse converte do tipo String para o int
				ProductArquivo product = new ProductArquivo(name, price, quantity); //Instanciando cada novo produto a partir dos valores lidos
				list.add(product); //Adicionando o novo produto na minha lista
				line = br.readLine(); //Passa pra próxima linha até que não tenha mais linhas para ler
				
				//Escrevendo no novo arquivo summary.csv:		
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathNewFile))) {
					for (ProductArquivo itemProduct: list) { // Percorrendo todos os produtos lidos e adicionados na lista
						bw.write(itemProduct.getName() + "," + String.format("%.2f", itemProduct.total())); //Vou escrever na linha do arquivo summary.csv o nome do produto separando com uma vírgula e o valor total calculado. O método format é usado para definir quantas casas decimais vai ser exibidas
						bw.newLine(); //Passando pra escrever na próxima linha do arquivo
					}
					System.out.println(pathNewFile + "CREATED");
				} catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}

//Link do Youtube que o professor resolve o exercício=> https://youtu.be/bIPd_451uEg