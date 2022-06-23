package questao1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class TabelaFipe {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			String marca, modelo;
			int menu=0; 
			int	ano=0; 
			int somarAno=0; 
			int mediaAno=0; 
			int i=0;
			double valor=0;
			double contarValor=0;
			
			ArrayList <String> TabelaFipe = new ArrayList<String>();
			System.out.println("1- Cadastrar carro\n2- Listagem Geral\n3- Mostrar resultados\n4-Sair");
			menu = ler.nextInt();
			do {	
				switch(menu) {
							
				case 1:
					
						System.out.print("Insira o ano do veiculo: \n");
						ano = ler.nextInt();
						if(ano<=2021) 
						{				
						
							System.out.printf("Insira aqui a marca do veiculo: \n");
							marca = ler.next();
							System.out.printf("Insira aqui o modelo do veiculo: \n");
							modelo = ler.next();
							
							
							System.out.print("Informe aqui o valor do veiculo: \n");
							valor = ler.nextDouble();
							
							contarValor+=ano;
							
							TabelaFipe.add(marca + ";" + modelo + ";" + Integer.toString(ano) + ";" + Double.toString(valor));
							
							if(valor>=50000) {
							contarValor++;	
							break;}
							else 
							{
								System.out.println("Coloque um ano que seja valido:");
							}
							
						}
				
				case 2:
					
					for (String carros: TabelaFipe) {
					System.out.printf(carros+"\n");
					i++;
					}
					break;
				
				case 3:
						System.out.printf("Para carros com valor acima ou igual a R$ 50.000,00: " + contarValor + "\n");
						mediaAno=(somarAno/TabelaFipe.size());
						System.out.printf("A media total de todos os veiculos cadastrados é: " + mediaAno + "\n");
					break;
				
				case 4:
					break;
				default: 
					System.out.println("Insira um valor que seja válido!"); 
			}
				if(menu!=4) {
				System.out.println("1- Cadastrar carro\n2- Listagem Geral\n3- Mostrar resultados\n4- Sair");
				menu = ler.nextInt();} 
				else 
				{break;}

			}while(menu!=4);
			}

}}

			