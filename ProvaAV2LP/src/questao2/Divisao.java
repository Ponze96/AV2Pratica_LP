package questao2;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int matriz1;
		int matrizinversa[][] = new int[2][2];
		Scanner sc = new Scanner(System.in); 
		int matriz[][] = new int[2][2]; 
		for (int i = 0; i < matriz.length; i++) {
			for (int b = 0; b < matriz[i].length; b++) {
				System.out.printf("Coloque aqui o %do valor da %da linha : ", b + 1, i + 1);
				matriz[i][b] = sc.nextInt();
			}
		}
		
		int matsegunda[][] = new int[2][2]; 
		for (int i = 0; i < matsegunda.length; i++) {
			for (int e = 0; e < matsegunda[i].length; e++) {
				System.out.printf("Coloque aqui %do valor da %da linha : ", e + 1, i + 1);
				matsegunda[i][e] = sc.nextInt();
			}
		}
		sc.close();
		
		double resultadodeterminante = (matsegunda[0][1] * matsegunda[1][1])- (matsegunda[0][1]*matsegunda[1][0]);	

		if(resultadodeterminante!=0)
			{
				System.out.println("O resultado Determinante desta matriz : " + resultadodeterminante);
			}
		else {
			System.out.println("O  resultado Determinante não ter o valor 0");
		
		}
		
		matrizinversa[0][0] = matsegunda[1][1];
		matrizinversa[0][1] = matsegunda[0][1] * -1;
		matrizinversa[1][0] = matsegunda[1][0] * -1;
		matrizinversa[1][1] = matsegunda[0][0];
		
		double calcular=0;
		calcular=(1/resultadodeterminante);
		double auxiliar[][] = new double[2][2];
		
		int calc = 0;
		auxiliar[0][0]=matrizinversa[0][0] * calc;
		auxiliar[0][1]=matrizinversa[0][1] * calc;
		auxiliar[1][0]=matrizinversa[1][0] * calc;
		auxiliar[1][1]=matrizinversa[1][1] * calc;
		
		double matrizEnd[][] = new double[2][2];
	
		
		for(int i=0;i<2;i++){
            for(int z=0;z<2;z++){
                    
                for(int l=0;l<2;l++){
                	matrizEnd[z]=(matriz1[l] * auxiliar[l][z]);
                    }
                    }    
                }
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        System.out.print(matrizEnd[j]+ " | ");    
                    }    
                        System.out.println();
                    }    
          }
    }	


