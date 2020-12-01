package main;
import java.io.*;
import java.util.*;

import heapsort.HeapSort;


public class main {

	public static void main(String[] args) {
		int algoritimo = 0;
		int tipo = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Algoritimos\nHeapSort - 1\n\n");
		
		System.out.print("Qual Algoritimo deseja executar: ");
		algoritimo = ler.nextInt();
		
		if(algoritimo == 1) {
			System.out.print("Conta - 1, CPF - 2, Agencia - 3: ");
			tipo = ler.nextInt();
			
			HeapSort(tipo);
		}
	}
	
	public static void HeapSort(int tipo) {
		Scanner ler = new Scanner(System.in);
		String[][] lido = LerArquivos();
		
		int[] result = new int[lido.length]; 
		
		for(int i=0; i<lido.length; i++) {
				result[i] = Integer.parseInt(lido[i][tipo]);			
				//System.out.print(Integer.parseInt(lido[i][2]) + " ");
		}
		
		//int[] vet = {32,84,12,43,21,11,90,22,44,45};
		
		System.out.print("Lista: ");
		
		for(int i:result) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		HeapSort.ordem(result);
		
		System.out.print("Lista ordenada: ");
		for(int i:result) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n\n\n");
		
		System.out.print("Deseja ver os dados ordenados: Não - 0, Sim - 1: ");
		int mostrar = ler.nextInt();
		
		if(mostrar == 1) {
			System.out.print("\n\n\n");
			for(int i=0; i<lido.length; i++) {
				for(int k=0; k<result.length; k++) {
					if(Integer.parseInt(lido[k][tipo]) == result[i]) {
						System.out.println(lido[k][5] + " " + lido[k][4] + " " + lido[k][3] + " " + lido[k][2] + " " + lido[k][1]);
					}
				}
			}
		}
		
	}
	
	public static String[][] LerArquivos() {
		
		String arquivoCSV = "arqvs/conta500alea.txt";
	    BufferedReader br = null;
	    String linha = "";
	    String csvDivisor = ";";
	    int x = 0;
	    
	    try {
	    	
	    	File arquivoLeitura = new File(arquivoCSV);
	    	LineNumberReader linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));
	    	linhaLeitura.skip(arquivoLeitura.length());
	    	int qtdLinha = linhaLeitura.getLineNumber();
	    	
	    	String [][] line = new String[qtdLinha][6];
	    	//System.out.println(qtdLinha);
	    	
	    	
	        br = new BufferedReader(new FileReader(arquivoCSV));
	        while ((linha = br.readLine()) != null) {
	        	
	        	String[] conta = linha.split(csvDivisor);
	        	
	        	/**System.out.println("Conta \n\nCPF:  " + conta[conta.length-5] 
										                 + " \nNome: " + conta[conta.length-4]
										                 + " \nAgencia: " + conta[conta.length-3]
										                 + " \nConta: " + conta[conta.length-2]
										                 + " \nSaldo: R$ " + conta[conta.length-1] + "\n");**/
	        	
	        	for(int i=5; 1<=i; i--) {
	        		line[x][i] = conta[conta.length-i];	        		
	        	}
	        	
	        	//System.out.println(line[x][5] + " " + line[x][4] + " " + line[x][3] + " " + line[x][2] + " " + line[x][1]);
	        	
	        	
	            x++;
	        }
	        
	        return line;

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (br != null) {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
		return null;
	  }
}
