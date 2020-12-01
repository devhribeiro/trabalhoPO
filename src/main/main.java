package main;
import java.io.*;

import heapsort.HeapSort;


public class main {

	public static void main(String[] args) {
		/**int[] vet = {32,84,12,43,21,11,90,22,44,45};
		
		System.out.print("Lista: ");
		
		for(int i:vet) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		HeapSort.ordem(vet);
		
		System.out.print("Lista ordenada: ");
		for(int i:vet) {
			System.out.print(i+" ");
		}**/
		
		LerArquivos();
		
	}
	
	public static void LerArquivos() {
		
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
	        	
	        	System.out.println(line[x][5] + " " + line[x][4] + " " + line[x][3] + " " + line[x][2] + " " + line[x][1]);
	        	
	        	
	            x++;
	        }

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
	  }
}
